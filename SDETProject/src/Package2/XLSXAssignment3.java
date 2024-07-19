package Package2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXAssignment3 {
	
//	Assignment3 : Create a method(ReadDataBasedUponRange) and pass the initial row and end row 
//	that method will read the data based upon that range

    public void ReadDataBasedUponRange(int startRow, int endRow) throws IOException {
    	
        File file = new File("../SDETProject/xlsxExcelfile1.xlsx"); // Connection
        FileInputStream fileInput = new FileInputStream(file); // Input stream
        XSSFWorkbook xlsxWorkbook = new XSSFWorkbook(fileInput); // Workbook
        XSSFSheet xSheet = xlsxWorkbook.getSheetAt(0); // Sheet
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the initial row number (0-based index): ");
        int startRow1 = scanner.nextInt();

        System.out.print("Enter the end row number (0-based index): ");
        int endRow1 = scanner.nextInt();
        
        if (startRow1 < 0 || endRow1 >= xSheet.getPhysicalNumberOfRows() || startRow1 > endRow1) {
            System.out.println("Invalid row range.");
            fileInput.close();
            return;
        }
        
        for (int i = startRow1; i <= endRow1; i++) {
            XSSFRow row = xSheet.getRow(i);
            if (row != null) {
                int numberOfCells = row.getPhysicalNumberOfCells();
                for (int j = 0; j < numberOfCells; j++) {
                    XSSFCell cell = row.getCell(j);
                    if (cell != null) {
                        switch (cell.getCellType()) {
                            case 1:
                                System.out.print(cell.getStringCellValue() + "\t");
                                break;
                            case 2:
                                System.out.print(cell.getNumericCellValue() + "\t");
                                break;
                            case 3:
                                System.out.print(cell.getBooleanCellValue() + "\t");
                                break;
                            case 4:
                                System.out.print(cell.getCellFormula() + "\t");
                                break;
                            default:
                                System.out.print("Unknown cell type" + "\t");
                                break;
                        }
                    } else {
                        System.out.print("Empty cell" + "\t");
                    }
                }
                System.out.println();
            } else {
                System.out.println("The row is empty.");
            }
        }
        
        fileInput.close();
    }

    public static void main(String[] args) throws IOException {
        XLSXAssignment3 readData = new XLSXAssignment3();
        
        // Example: Read data from rows 1 to 3 (0-based index)
        readData.ReadDataBasedUponRange(1, 3);
    }
}


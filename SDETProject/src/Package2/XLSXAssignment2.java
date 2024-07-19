package Package2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXAssignment2 {
	
//	Assignment2 : Create a method(ReadDataBasedUponRowNo) 
//	and that method will read the data of that particular row.

    public void ReadDataBasedUponRowNo() throws IOException {
        File file = new File("../SDETProject/xlsxExcelfile1.xlsx"); // Connection
        FileInputStream fileInput = new FileInputStream(file); // Input stream
        XSSFWorkbook xlsxWorkbook = new XSSFWorkbook(fileInput); // Workbook
        XSSFSheet xSheet = xlsxWorkbook.getSheetAt(0); // Sheet
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the row number (0-based index) you want to read: ");
        int rowNo = scanner.nextInt();

        if (rowNo >= 0 && rowNo < xSheet.getPhysicalNumberOfRows()) {
            XSSFRow row = xSheet.getRow(rowNo);
            if (row != null) {
                int numberOfCells = row.getPhysicalNumberOfCells();
                for (int i = 0; i < numberOfCells; i++) {
                    XSSFCell cell = row.getCell(i);
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
                System.out.println("The specified row is empty.");
            }
        } else {
            System.out.println("Invalid row number.");
        }
        fileInput.close();
        scanner.close();
    }

    public static void main(String[] args) throws IOException {
        XLSXAssignment2 readData = new XLSXAssignment2();
        readData.ReadDataBasedUponRowNo();
    }
}

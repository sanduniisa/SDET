package Package2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXAssignment1 {

    public void ReadDataBasedUponRowNoAndColumnNo() throws IOException {
        File file = new File("../SDETProject/xlsxExcelfile1.xlsx"); // connection
        FileInputStream fileInput = new FileInputStream(file); // input stream
        XSSFWorkbook xlsxworkbook = new XSSFWorkbook(fileInput); // workbook
        XSSFSheet xSheet = xlsxworkbook.getSheetAt(0); // sheet
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times you want to input row and column numbers: ");
        int numberOfInputs = scanner.nextInt();

        for (int input = 0; input < numberOfInputs; input++) {
            System.out.print("Enter the row number (0-based index): ");
            int rowNo = scanner.nextInt();

            System.out.print("Enter the column number (0-based index): ");
            int columnNo = scanner.nextInt();

            if (rowNo >= 0 && rowNo < xSheet.getPhysicalNumberOfRows()) {
                XSSFRow row = xSheet.getRow(rowNo);
                if (row != null && columnNo >= 0 && columnNo < row.getPhysicalNumberOfCells()) {
                    XSSFCell cell = row.getCell(columnNo);
                    if (cell != null) {
                        switch (cell.getCellType()) {
                            case 1:
                                System.out.println("Cell data: " + cell.getStringCellValue());
                                break;
                            case 2:
                                System.out.println("Cell data: " + cell.getNumericCellValue());
                                break;
                            case 3:
                                System.out.println("Cell data: " + cell.getBooleanCellValue());
                                break;
                            case 4:
                                System.out.println("Cell data: " + cell.getCellFormula());
                                break;
                            default:
                                System.out.println("Unknown cell type");
                                break;
                        }
                    } else {
                        System.out.println("Cell is empty");
                    }
                } else {
                    System.out.println("Invalid column number");
                }
            } else {
                System.out.println("Invalid row number");
            }
        }
        fileInput.close();
        scanner.close();
    }

    public static void main(String[] args) throws IOException {
        XLSXAssignment1 readData = new XLSXAssignment1();
        readData.ReadDataBasedUponRowNoAndColumnNo();
    }
}

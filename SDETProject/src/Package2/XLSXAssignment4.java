package Package2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXAssignment4 {
	
	//Assignment4 : Create a method (WriteData) and pass the rowCount and columnCount and 
	//that method will write based upon rowCount and ColumnCount and the data which 
	//we will write we have to take from user using Scanner Class

    public void WriteData(int rowCount, int columnCount) throws IOException {
        File file = new File("../SDETProject/xlsxExcelfile2.xlsx"); // File to write
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(); // Create a new workbook
        XSSFSheet xssfSheet = xssfWorkbook.createSheet("Sheet1"); // Create a new sheet

        Scanner scanner = new Scanner(System.in);

        // Prompt user for data
        for (int i = 0; i < rowCount; i++) { // Loop for rows
            XSSFRow row = xssfSheet.createRow(i); // Create row in sheet
            for (int j = 0; j < columnCount; j++) { // Loop for columns
                System.out.print("Enter data for row " + i + ", column " + j + ": ");
                String data = scanner.nextLine(); // Read data from user
                XSSFCell cell = row.createCell(j); // Create cell in row
                cell.setCellValue(data); // Set cell value
            }
        }

        // Write the output to the file
        try (FileOutputStream fileOut = new FileOutputStream(file)) {
            xssfWorkbook.write(fileOut);
        }

        // Close resources
        scanner.close();
    }

    public static void main(String[] args) throws IOException {
        XLSXAssignment4 writeData = new XLSXAssignment4();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows to write: ");
        int rowCount = scanner.nextInt();

        System.out.print("Enter the number of columns to write: ");
        int columnCount = scanner.nextInt();

        // Clear the newline left by nextInt
        scanner.nextLine();

        writeData.WriteData(rowCount, columnCount);
        scanner.close();
    }
}

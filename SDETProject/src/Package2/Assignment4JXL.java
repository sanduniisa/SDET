package Package2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

//Assignment4 : Create a method (WriteData) and pass the rowCount and columnCount and 
//that method will write based upon rowCount and ColumnCount and the data which 
//we will write we have to take from user using Scanner Class

public class Assignment4JXL {
	

	
	 public void writeData(int rowCount, int columnCount) throws IOException, WriteException{
	        File file = new File("../SDETProject/excelfile3.xls");
	        
	        // Create a writable workbook with a new sheet named "sheet3"
	        WritableWorkbook writableWorkbook = Workbook.createWorkbook(file);
	        WritableSheet wsheet = writableWorkbook.createSheet("sheet4", 0);

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the row count you want to create: ");
	        rowCount = scanner.nextInt();

	        System.out.println("Enter the column count you want to create: ");
	        columnCount = scanner.nextInt();

	        // Consume the newline character left by nextInt()
	        scanner.nextLine();

	        for (int i = 0; i < rowCount; i++) {
	            for (int j = 0; j < columnCount; j++) {
	                System.out.print("Enter the data to write at row " + i + " and column " + j + ": ");
	                String data = scanner.nextLine();
	                
	                // Create a label with the data and add it to the specified cell
	                Label label = new Label(j, i, data);
	                wsheet.addCell(label);
	            }
	        }

	        // Write and close the writable workbook
	        writableWorkbook.write();
	        writableWorkbook.close();

	        // Close the scanner
	        scanner.close();
	    }

	    public static void main(String[] args) throws IOException, WriteException{
	        Assignment4JXL writedataob = new Assignment4JXL();
	        writedataob.writeData(0, 0);
	    }
	}
package Package2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment3JXL {
	
	
//	Assignment3 : Create a method(ReadDataBasedUponRange) and pass the initial row and end row 
//	that method will read the data based upon that range
	
	public void ReadDataBasedUponRange(int initialRowNumber , int endRowNumber) throws BiffException, IOException {
		
		File file=new File("../SDETProject/excelfile2.xls");  // connection
		Workbook wb= Workbook.getWorkbook(file); //workbook object - no need to put new //return type is the object of the workbook
		Sheet workSheet = wb.getSheet(0); //sheet object
		
		System.out.println("Enter the initial row number you want to read" );
		Scanner scanner1= new Scanner(System.in);
		initialRowNumber = scanner1.nextInt();
		
		System.out.println("Enter the end row number you want to read" );
		Scanner scanner2= new Scanner(System.in);
		endRowNumber = scanner1.nextInt();
		
		int columns = workSheet.getColumns();
			
			for (int j = 0; j < columns; j++)  //loop for columns
			{
				
				for (int i = initialRowNumber; i <= endRowNumber; i++) {
					Cell cell= workSheet.getCell(j,i); //cell object  //pass the values column , row
					System.out.println(cell.getContents()); //cell content
				}			
			}		
	}
	public static void main(String[] args) throws BiffException, IOException {
		Assignment3JXL readDataRange=new Assignment3JXL();
		readDataRange.ReadDataBasedUponRange(0, 0);
}
}

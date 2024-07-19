package Package2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Assignment2JXL {
	
//	Assignment2 : Create a method(ReadDataBasedUponRowNo) 
//	and that method will read the data of that particular row.

	public void ReadDataBasedUponRowNo(int rowNo) throws BiffException, IOException {
		
		File file=new File("../SDETProject/excelfile2.xls");  // connection
		Workbook wb= Workbook.getWorkbook(file); //workbook object - no need to put new //return type is the object of the workbook
		Sheet workSheet = wb.getSheet(0); //sheet object
		
		System.out.println("Enter the row number you want to read" );
		Scanner scanner1= new Scanner(System.in);
		rowNo = scanner1.nextInt();
		
		int columns = workSheet.getColumns();
			
			for (int j = 0; j < columns; j++)  //loop for columns
			{
				
				Cell cell= workSheet.getCell(j,rowNo); //cell object  //pass the values column , row
				System.out.println(cell.getContents()); //cell content
				
			}	
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		Assignment2JXL readRow= new Assignment2JXL();
		readRow.ReadDataBasedUponRowNo(0);
		
	}
}

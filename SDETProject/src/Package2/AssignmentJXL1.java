package Package2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class AssignmentJXL1 {

	
//	Assignment1 : Create a method(ReadDataBasedUponRowNoAndColumnNo) and 
//	pass the rowNo and columnNo that method will read the data of that particular cell
//	while calling the method, pass the rowNo and columN and that method will read the
//	data of that particular cell
	
	public void ReadDataBasedUponRowNoAndColumnNo(int rowNo, int columnNo) throws BiffException, IOException {
		
		File file=new File("../SDETProject/excelfile2.xls");  // connection
		Workbook wb= Workbook.getWorkbook(file); //workbook object - no need to put new //return type is the object of the workbook
		Sheet workSheet = wb.getSheet(0); //sheet object
		
		System.out.println("Enter the row number you want to read" );
		Scanner scanner1= new Scanner(System.in);
		rowNo = scanner1.nextInt();
		
		System.out.println("Enter the column number you want to read" );
		Scanner scanner2= new Scanner(System.in);
		columnNo =scanner2.nextInt();
		
		Cell cell = workSheet.getCell(columnNo, rowNo);
		System.out.println(cell.getContents());
		
		
		
	}
	
public static void main(String[] args) throws BiffException, IOException {
	AssignmentJXL1 readdata= new AssignmentJXL1();
	readdata.ReadDataBasedUponRowNoAndColumnNo(0, 0);
}
}

package Package2;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelFileHandling {
	
	
	public void writeExcel() throws IOException, RowsExceededException, WriteException {
		File file=new File("../SDETProject/excelfile1.xls");//connection establishment
		WritableWorkbook wb= Workbook.createWorkbook(file); //writable workbook object
		WritableSheet wSheet= wb.createSheet("newexcel2", 0);// writable sheet object
		
		
		for (int i = 0; i < 3; i++) //loop for rows
		{			
			for (int j = 0; j < 3; j++)//loop for columns
			{		
				Label L= new Label(i, j, "student_number"); //cell structure
				wSheet.addCell(L); // add the cell to the sheet
						
			}
					
		}
		wb.write(); //for saving the data
		wb.close(); // for closing the file
	}
	
	public void readExcel() throws BiffException, IOException{
		
		File file=new File("../SDETProject/excelfile1.xls");  // connection
		Workbook wb= Workbook.getWorkbook(file); //workbook object - no need to put new //return type is the object of the workbook
		Sheet workSheet = wb.getSheet(0); //sheet object
		int rows = workSheet.getRows();  //fetch the number of rows
		int columns = workSheet.getColumns(); // fetch the number of columns
		
		
		for (int i = 0; i < rows; i++) //loop for rows
		{ 
			
			for (int j = 0; j < columns; j++)  //loop for columns
			{
				
				Cell c1= workSheet.getCell(j,i); //cell object  //pass the values column , row
				System.out.println(c1.getContents()); //cell content
				
			}
			
		}
	  
	}

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException{
		ExcelFileHandling readExcelFileHandling = new ExcelFileHandling();
		readExcelFileHandling.writeExcel();
		
		
	}
	
}



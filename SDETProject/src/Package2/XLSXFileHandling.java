package Package2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXFileHandling {
	
	public void writeFile() throws IOException {
        File file = new File("../SDETProject/xlsxExcelfile1.xlsx");
        FileOutputStream fileOutput = new FileOutputStream(file);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook();
        XSSFSheet xssfSheet = xssfWorkbook.createSheet("sheet78");

        for (int i = 0; i < 3; i++) { // loop for rows
            XSSFRow xssfRow = xssfSheet.createRow(i);
            for (int j = 0; j < 3; j++) {
                XSSFCell xssfCell = xssfRow.createCell(j);
                xssfCell.setCellValue("Sanduni");
            }
        }
        xssfWorkbook.write(fileOutput); //move the data from workbook to stream
        fileOutput.flush(); //move the data from stream to the file
        fileOutput.close(); //for closing the file
        
    }
	

	public void readFile() throws IOException {
		
		File file = new File("../SDETProject/xlslExcelfile1.xlsx"); //connection
		FileInputStream fileInput= new FileInputStream(file); //input stream
		XSSFWorkbook xlsxworkbook=new XSSFWorkbook(fileInput); //workbook
		XSSFSheet xSheet= xlsxworkbook.getSheetAt(0); //sheet
		int rows = xSheet.getPhysicalNumberOfRows(); //no of rows
		
		for (int i = 0; i < rows; i++) 
		{ //loop for rows
			
			XSSFRow xRow= xSheet.getRow(i); //row object
			int c = xRow.getPhysicalNumberOfCells(); //no of columns
			
			for (int j = 0; j < c; j++) 
			{ //loop for column
				XSSFCell xCell= xRow.getCell(j); //cell object
				System.out.println(xCell.getNumericCellValue()); //cell data
			}
			
		}

	}
	public static void main(String[] args) throws IOException {
		XLSXFileHandling obj = new XLSXFileHandling();
		obj.writeFile();
	}
	}

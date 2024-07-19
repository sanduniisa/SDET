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

public class Assignment5JXL {

    // Assignment5: Read from file and Write that data into File2 (Copy + Paste)
    public void copyNpasteXLS() throws BiffException, IOException, WriteException {
        // Source file
        File file1 = new File("../SDETProject/excelfile2.xls");  // connection
        Workbook wb = Workbook.getWorkbook(file1); // read existing workbook
        Sheet workSheet = wb.getSheet(0); // get the first sheet

        // Destination file
        File file2 = new File("../SDETProject/excelfile4.xls");
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(file2); // create a new writable workbook
        WritableSheet wsheet = writableWorkbook.createSheet("sheet4", 0); // create a new sheet

        int columns = workSheet.getColumns();
        int rows = workSheet.getRows();

        for (int i = 0; i < rows; i++) { // loop for rows
            for (int j = 0; j < columns; j++) { // loop for columns
                Cell cell = workSheet.getCell(j, i); // get cell from source sheet
                String datafile1 = cell.getContents(); // get cell content
                Label label = new Label(j, i, datafile1); // create a label with the data
                wsheet.addCell(label); // add the label to the destination sheet
            }
        }

        // Write and close the writable workbook
        writableWorkbook.write();
        writableWorkbook.close();

        // Close the read-only workbook
        wb.close();
    }

    public static void main(String[] args) throws BiffException, WriteException, IOException {
    	Assignment5JXL copynpasteobj = new Assignment5JXL();
        copynpasteobj.copyNpasteXLS();
	}
}

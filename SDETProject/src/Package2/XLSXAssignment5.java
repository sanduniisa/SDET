package Package2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSXAssignment5 {
	

	// Assignment5: Read from file and Write that data into File2 (Copy + Paste)
    public void copyAndPasteData() throws IOException {
        File inputFile = new File("../SDETProject/xlsxExcelfile1.xlsx"); // Source file
        File outputFile = new File("../SDETProject/xlsxExcelfile2.xlsx"); // Destination file

        // Create a workbook to read data from
        XSSFWorkbook inputWorkbook = new XSSFWorkbook(new FileInputStream(inputFile));
        XSSFSheet inputSheet = inputWorkbook.getSheetAt(0); // Read the first sheet

        // Create a workbook to write data to
        XSSFWorkbook outputWorkbook = new XSSFWorkbook();
        XSSFSheet outputSheet = outputWorkbook.createSheet("CopiedData"); // Create a new sheet

        // Copy data from source to destination
        int rows = inputSheet.getPhysicalNumberOfRows();
        for (int i = 0; i < rows; i++) {
            XSSFRow inputRow = inputSheet.getRow(i);
            if (inputRow != null) {
                XSSFRow outputRow = outputSheet.createRow(i);
                int cells = inputRow.getPhysicalNumberOfCells();
                for (int j = 0; j < cells; j++) {
                    XSSFCell inputCell = inputRow.getCell(j);
                    if (inputCell != null) {
                        XSSFCell outputCell = outputRow.createCell(j);
                        switch (inputCell.getCellType()) {
                            case 1:
                                outputCell.setCellValue(inputCell.getStringCellValue());
                                break;
                            case 2:
                                outputCell.setCellValue(inputCell.getNumericCellValue());
                                break;
                            case 3:
                                outputCell.setCellValue(inputCell.getBooleanCellValue());
                                break;
                            case 4:
                                outputCell.setCellFormula(inputCell.getCellFormula());
                                break;
                            default:
                                outputCell.setCellValue(inputCell.toString());
                                break;
                        }
                    }
                }
            }
        }

        // Write the output to the file
        try (FileOutputStream fileOut = new FileOutputStream(outputFile)) {
            outputWorkbook.write(fileOut);
        }

    }

    public static void main(String[] args) throws IOException {
        XLSXAssignment5 copyPaste = new XLSXAssignment5();
        copyPaste.copyAndPasteData();
    }
}

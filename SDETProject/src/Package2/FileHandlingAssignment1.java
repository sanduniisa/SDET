package Package2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingAssignment1 {
	
//	//1.create a method name ReadData and pass the row no and 
//	that method will read the data of particular row

	
	public void ReadData(int rowNo) throws IOException {
		
		File file = new File("../SDETProject/Sanduni");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader =new BufferedReader(fileReader);
		
		
		System.out.println("Enter the row number you want to read   :  ");
		Scanner scanner= new Scanner(System.in);
		rowNo = scanner.nextInt();
		
		int currentRow = 0;
		
		String lineString;
		
	    while ((lineString = bufferedReader.readLine())!= null) {
	    	
	    	if (currentRow == rowNo) {
	    		
	    		System.out.println("Data at row no " +rowNo + ":" +lineString);
	    		break;
	    	} 
	    	currentRow++; 

			}
	    if (lineString == null) {
            System.out.println("Row number out of range.");
        }
	    
	    bufferedReader.close();
	    fileReader.close();
	    } 
		
	
	
	public static void main(String[] args) throws IOException {
		FileHandlingAssignment1 obFileHandlingAssignment1 = new FileHandlingAssignment1();
		obFileHandlingAssignment1.ReadData(0);
	}
}

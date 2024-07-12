package Package2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingAssignment5 {
	
	
//read from file 1 and write that data into file2
	
	public void copyNpasteFunction() throws IOException {
		
		
		File file1 = new File("../SDETProject/Sanduni");
		FileReader objectFileReader = new FileReader(file1);
		BufferedReader objectBufferedReader = new BufferedReader(objectFileReader);
		
		
		File file2 = new File("../SDETProject/SanduniImalsha");  
		FileWriter fw = new FileWriter(file2);
		BufferedWriter bufferedWriter = new BufferedWriter(fw);
		
		String lineString;
		while ((lineString = objectBufferedReader.readLine())!=null) {
			
			bufferedWriter.write(lineString); 
			bufferedWriter.newLine();
			
		}
		bufferedWriter.close();
	}

	
	public static void main(String[] args) throws IOException {
		FileHandlingAssignment5 objectAssignment5 = new FileHandlingAssignment5();
		objectAssignment5.copyNpasteFunction();
	}
}

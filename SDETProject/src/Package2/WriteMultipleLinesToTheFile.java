package Package2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteMultipleLinesToTheFile {
	
	public void multipleLineWrite() throws IOException {
		
		File file = new File("../SDETProject/SanduniImalsha"); // here you are giving a new file name. and to show that file in the project explorer. you have to refresh the project
		FileWriter fw = new FileWriter(file); //for line by line
		BufferedWriter bufferedWriter = new BufferedWriter(fw);
		
		for (int i = 0; i <= 10; i++) {
			bufferedWriter.write("I love my husband Isuru Soo much");
			bufferedWriter.newLine();
			
		}
		bufferedWriter.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		WriteMultipleLinesToTheFile multipleLines = new WriteMultipleLinesToTheFile();
		multipleLines.multipleLineWrite();
	}

}

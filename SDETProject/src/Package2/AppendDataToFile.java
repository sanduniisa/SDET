package Package2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendDataToFile {
	
	public void appendData() throws IOException {
		
		File file = new File("../SDETProject/SanduniImalsha");
		FileWriter fW= new FileWriter(file, true); 
		BufferedWriter bufferedWriter =new BufferedWriter(fW); 
		bufferedWriter.newLine();
		
		for (int i = 0; i <=10; i++) {
			bufferedWriter.write("Appending Data - I  love you my Isuru.");
			bufferedWriter.newLine();
			bufferedWriter.write("My husband Isuru is my Life.");
			bufferedWriter.newLine();
		}
		
		
		bufferedWriter.close();
		
	}
	
	public static void main(String[] args) throws IOException {
		
		AppendDataToFile appendDataToFile=new AppendDataToFile();
		appendDataToFile.appendData();
	}

}

package Package2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;


//read a txt file character by character

public class FileHandling {
	
	public void readFileData() throws IOException {
		
		File file = new File("../SDETProject/Sanduni");
		FileReader fileReader = new FileReader(file);
		
		
		int a;
		while ((a = fileReader.read())!= -1) {
			//while loop will execute until it not equal to -1
			
			System.out.println((char)a);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		FileHandling fileHandling = new FileHandling();
		fileHandling.readFileData();
	}

}

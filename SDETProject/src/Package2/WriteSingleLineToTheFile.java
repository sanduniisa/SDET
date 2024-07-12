package Package2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteSingleLineToTheFile {
	
	public void singleLineWrite() throws IOException {
		
		File file = new File("../SDETProject/Sanduni");
		FileWriter fw = new FileWriter(file); //for line by line
		fw.write("I love my husband."); // for write
		fw.close(); // for save and close the file
		
		//this will override the existing txt file. means the previous sentences are removing and new lines are adding.
		
		
	}
	
	public static void main(String[] args) throws IOException {
		WriteSingleLineToTheFile singleline = new WriteSingleLineToTheFile();
		singleline.singleLineWrite();
		
	}

}

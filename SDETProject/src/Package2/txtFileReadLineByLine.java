package Package2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class txtFileReadLineByLine {
	
public void readFileDataLineByLine() throws IOException {
		
		File file = new File("../SDETProject/Sanduni");
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader =new BufferedReader(fileReader);
		
		
		String s;
		while ((s = bufferedReader.readLine())!= null) {
			//while loop will execute until it not equal to null
			
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		txtFileReadLineByLine fileHandling = new txtFileReadLineByLine();
		fileHandling.readFileDataLineByLine();
	}

}

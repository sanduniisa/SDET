package Package2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingAssignment3 {

	
//	create a method named WriteData and pass the rowCount and that method will
//	write till that rowcount and you have to take the data from user, 
//	that should be write in the file
	
	
	public void WriteData(int rowCount) throws IOException {
		
		File file = new File("../SDETProject/SanduniImalsha");
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		System.out.println("Enter the row count");
		Scanner scanner1 = new Scanner(System.in);
		rowCount = scanner1.nextInt();
		
		for (int i = 1; i <= rowCount; i++) {
			
			System.out.println("Enter what you want to write line by line");
			Scanner scanner2 = new Scanner(System.in);
			String lineWriteString = scanner2.nextLine();
			
			bufferedWriter.write(lineWriteString);
			bufferedWriter.newLine();
				
			}
			bufferedWriter.close();
		}
		
	public static void main(String[] args) throws IOException {
		FileHandlingAssignment3 objectAssignment3 = new FileHandlingAssignment3();
		objectAssignment3.WriteData(0);
	}	
}

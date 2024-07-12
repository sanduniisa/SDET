package Package2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingAssignment4 {
	
//	Create a method named WriteDataInaRange and pass the initialrowCount, 
//	endrowCount and that method will write in that range and you have to take the data from user,
//	that should be write in the file(2,7) 
//	while calling the method should write from 2nd to 7th line and first line will be blank
	
	
	
	public void WriteDataInaRange(int initialrowCount , int endrowCount) throws IOException {

		File file = new File("../SDETProject/SanduniImalsha");
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		System.out.println("Enter the initial row count");
		Scanner scanner1 = new Scanner(System.in);
		initialrowCount = scanner1.nextInt();
		
		System.out.println("Enter the end row count");
		Scanner scanner2 = new Scanner(System.in);
		endrowCount = scanner1.nextInt();
		
		
		bufferedWriter.newLine();
		for (int i = initialrowCount ; i <= endrowCount; i++) {
			
			System.out.println("Enter what you want to write line by line");
			Scanner scanner3 = new Scanner(System.in);
			String lineWriteString = scanner3.nextLine();
			
			

			bufferedWriter.write(lineWriteString);
			bufferedWriter.newLine();
				
			}
			bufferedWriter.close();
		}
		
	public static void main(String[] args) throws IOException {
		FileHandlingAssignment4 objectAssignment4 = new FileHandlingAssignment4();
		objectAssignment4.WriteDataInaRange(0, 0);
	}	
	}



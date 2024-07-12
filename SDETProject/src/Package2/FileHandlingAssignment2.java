package Package2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class FileHandlingAssignment2 {

//	create a method named ReadDataOfRange and pass the initial row no and end row no,
//	that will read the data of that particular range

	public void ReadDataOfRange(int initialRowNo , int EndRowNo) throws IOException {
		
		File file = new File("../SDETProject/SanduniImalsha");
		FileReader fileReader = new FileReader(file);
		BufferedReader bReader = new BufferedReader(fileReader);
		
		System.out.println("Enter the inital row number");
		Scanner scanner1 = new Scanner(System.in);
		initialRowNo = scanner1.nextInt();
		
		System.out.println("Enter the end row number");
		Scanner scanner2 = new Scanner(System.in);
		EndRowNo = scanner2.nextInt();
		
		
		
		for (int i = initialRowNo; i<= EndRowNo; i++) {
			   
			   System.out.println( bReader.readLine());
				
			}
		
		
	}
public static void main(String[] args) throws IOException {
	
	FileHandlingAssignment2 object2=new FileHandlingAssignment2();
	object2.ReadDataOfRange(0, 0);
	
}	
}

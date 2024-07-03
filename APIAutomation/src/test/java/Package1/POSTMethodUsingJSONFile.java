package Package1;

import  static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class POSTMethodUsingJSONFile {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		
		File f=new File("../APIAutomation/BodyData.json"); //connection establishment
		FileReader fReader=new FileReader(f); //for reading character by character
		JSONTokener js=new JSONTokener(fReader); //for reading JSON type of format file
		JSONObject j=new JSONObject(js);// data is starting from json object
		//System.out.println(j);
		
		Response res=
		given().contentType(ContentType.JSON).body(j.toString()) .when().post("http://localhost:3000/APIStudents");
				
		
		System.out.println("Status Code is ");
		System.out.println(res.getStatusCode());
		System.out.println("Response Data is");
		System.out.println(res.asString());
		
		
	}

}

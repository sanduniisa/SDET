package Package1;

import static io.restassured.RestAssured.*;

import ch.qos.logback.core.status.Status;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetAllTestCase {

	public static void main(String[] args) 
	{
		
		Response res =
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/APIStudents");
		
		
		//.get("https://reqres.in/api/users?page=2"); ----> from another realtime dummy api - link : https://reqres.in/
		//.get("https://dummy.restapiexample.com/api/v1/employees");----- >from : link : https://dummy.restapiexample.com/
		
		
		//res is the reference variable of the Response class
		//get() returns the response of the class 
		//Res is the reference variable of the Response class
		//*********this interpret :- a method can return the object of a class concept *********
		//path parameter where id is 3bd5 http://localhost:3000/APIStudents/idValue  : .get("http://localhost:3000/APIStudents/3bd5");
		//Query parameter .get("http://localhost:3000/APIStudents?FirstName=Isuru");
		
		//authentication is in the given() section
		//cannot put multiple given() in a method
		
		
		System.out.println("Status Code is ");
		System.out.println(res.getStatusCode());
		System.out.println("Response Data is");
		System.out.println(res.asString());
		
	}
	
	
}

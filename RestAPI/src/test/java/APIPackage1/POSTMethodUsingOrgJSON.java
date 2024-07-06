package APIPackage1;

import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POSTMethodUsingOrgJSON {
	
	public static void main(String[] args) {
		//Array Data
		//first write the inner part of the objects and then go to the outer objects 
		
		JSONObject inner1= new JSONObject();
		inner1.put("apartmentnumber", "1B");
		inner1.put("state", "Matara");
		
		JSONObject inner2= new JSONObject();
		inner2.put("apartmentnumber", "33/12");
		inner2.put("state", "HakmanaRoad");
		
		JSONArray array= new JSONArray();
		array.put(0,inner1);
		array.put(1,inner2);
		
		
		JSONObject outer= new JSONObject();
		outer.put("FistName", "Upul");
		outer.put("LastName", "Kithsiri");
		outer.put("Designation", "Businessman");
		outer.put("Address", array);
		
		//System.out.println(j.toString());
		//System.out.println(outer.toString());
		
	     Response res=
				given().contentType(ContentType.JSON).body(outer.toString()) .when().post("http://localhost:3000/APIStudents");
	     
	     
	     System.out.println("Status Code is " +res.getStatusCode());
		 System.out.println("Response Data is" +res.asString());
		 
		 //===========================================//
		 
		 //complex json
		 
		 /*JSONObject inner= new JSONObject();
			inner.put("apartmentnumber", "1B");
			inner.put("state", "Matara");	
			
			JSONObject outer= new JSONObject();
			outer.put("FistName", "Upul");
			outer.put("LastName", "Kithsiri");
			outer.put("Designation", "Businessman");
			outer.put("Address", inner);
			
			//System.out.println(j.toString());
			//System.out.println(outer.toString());
			
		     Response res=
					given().contentType(ContentType.JSON).body(outer.toString()) .when().post("http://localhost:3000/APIStudents");*/
		     
		 
		 
		//====================================================//
		 
		 //simple json
		 
		 /*JSONObject j= new JSONObject();
			j.put("apartmentnumber", "1B");
			j.put("state", "Matara");	
			j.put("FistName", "Upul");
			j.put("LastName", "Kithsiri");
			j.put("Designation", "Businessman");
			j.put("Address", inner);
			
			//System.out.println(j.toString());
			//System.out.println(j.toString());
			
		     Response res=
					given().contentType(ContentType.JSON).body(j.toString()) .when().post("http://localhost:3000/APIStudents");*/
		     
		 
				
	}


}

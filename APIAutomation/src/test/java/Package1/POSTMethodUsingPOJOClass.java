package Package1;

import  static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class POSTMethodUsingPOJOClass {
	
	public static void main(String[] args) {
		
		AddressInformation[] addressInformation= new AddressInformation[2];
		
		addressInformation[0]= new AddressInformation();
		
		addressInformation[0].setNo("13B");
		addressInformation[0].setStreetStringName("Awariyawattha");
		addressInformation[0].setCity("Pamburana");
		addressInformation[0].setDistrict("Matara");
		
		
		addressInformation[1]= new AddressInformation();
		
		addressInformation[1].setNo("1/208");
		addressInformation[1].setStreetStringName("Udumulla");
		addressInformation[1].setCity("Mulleriyawa");
		addressInformation[1].setDistrict("Colombo");
		
		
		
		
		
		//complex json the inner class should be write first - for the sake of easy
//		AddressInformation addressInformation= new AddressInformation();
//		addressInformation.setNo("13B");
//		addressInformation.setStreetStringName("Awariyawattha");
//		addressInformation.setCity("Pamburana");
//		addressInformation.setDistrict("Matara");
		
		
		
		//simple json
		BasicInformation basicInfo=new BasicInformation();
		basicInfo.setFirstName("Sanduni");
		basicInfo.setLastName("Imalsha");
		basicInfo.setID("saa");
		basicInfo.setDesignation("QA Analyst");
		basicInfo.setAddress(addressInformation);
		
		
		
		Response res =given().contentType(ContentType.JSON).body(basicInfo) .when().post("http://localhost:3000/APIStudents");
		
		System.out.println("Status Code is " +res.getStatusCode());
		System.out.println("Response Data is" +res.asString());
	}

}

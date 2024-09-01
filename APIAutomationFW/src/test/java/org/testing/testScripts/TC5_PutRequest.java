package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.JsonFile;
import org.testing.utilities.PropertiesFile;

public class TC5_PutRequest {
	
	@Test
	public void testCase7() throws IOException {
		Properties propertiesobj=PropertiesFile.loadProperties("../APIAutomationFW/URI.properties");
		String requestBody =JsonFile.loadJSONData("../APIAutomationFW/src/test/java/org/testing/resources/upateBody.json");
		
		HttpMethods httpmethod1 = new HttpMethods(propertiesobj);
		
		httpmethod1.putRequest("QA_URI", "2", requestBody);
	}
}

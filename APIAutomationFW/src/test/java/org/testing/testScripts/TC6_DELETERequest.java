package org.testing.testScripts;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.Properties;

import org.testing.testSteps.HttpMethods;
import org.testing.utilities.PropertiesFile;

public class TC6_DELETERequest {
	
	@Test
	public void testCase8() throws IOException {
		
		Properties propertiesobj= PropertiesFile.loadProperties("../APIAutomationFW/URI.properties");
		
		HttpMethods httpmethod2 = new HttpMethods(propertiesobj);
		httpmethod2.deleteRequest("QA_URI", "2");
		
	}

}
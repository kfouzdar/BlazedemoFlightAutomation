package com.blazedemo.testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.blazedemo.base.TestBase;
import com.blazedemo.utilities.TestUtil;

public class ConfirmFlightTest extends TestBase {
	
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void confirmFlightTest(Hashtable<String,String> data) throws InterruptedException, IOException{
		
			verifyEquals("confirmtext_XPATH",data.get("confirmmessage"));
			
			String status = getTextFromCell("Conftabledata_CLASS","statusrowdata_XPATH","statuscelldata_XPATH");
			
			
			Assert.assertTrue(status.contains(data.get("status")));
			
			String statusvalue = getTextFromCell("Conftabledata_CLASS","statusrowdata_XPATH","statusvaluecelldata_XPATH");
			
			Assert.assertTrue(statusvalue.contains(data.get("statusvalue")));
			

		
		Thread.sleep(2000);
		
		
	}
	
	

}

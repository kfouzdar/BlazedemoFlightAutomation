package com.blazedemo.testcases;

import java.io.IOException;
import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

import com.blazedemo.base.TestBase;
import com.blazedemo.utilities.TestUtil;

public class SelectFlightTest extends TestBase {
	
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void selectFlightTest(Hashtable<String,String> data) throws InterruptedException, IOException{
		

		select("departcity_XPATH",data.get("departurecity"));
		select("desticity_XPATH",data.get("destinationcity"));
		click("findflightbtn_XPATH");
		Thread.sleep(2000);
		
		
		verifyEquals("headertext_XPATH",data.get("texttoverify"));
		
		Thread.sleep(2000);
		
	}
	
	

}

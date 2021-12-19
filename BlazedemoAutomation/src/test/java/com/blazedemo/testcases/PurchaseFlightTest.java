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

public class PurchaseFlightTest extends TestBase {
	
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void purchaseFlightTest(Hashtable<String,String> data) throws InterruptedException, IOException{
		
		
		selectFromTable("tabledata_CLASS","rowdata_XPATH","celldata_XPATH");
		
		type("name_XPATH",data.get("name"));
		type("address_XPATH",data.get("address"));
		type("city_XPATH",data.get("city"));
		type("city_XPATH",data.get("city"));
		type("state_XPATH",data.get("state"));
		type("zipcode_XPATH",data.get("zipcode"));
		type("cardtype_XPATH",data.get("cardtype"));
		type("cardnumber_XPATH",data.get("cardnumber"));
		type("month_XPATH",data.get("month"));
		type("year_XPATH",data.get("year"));
		type("nameoncard_XPATH",data.get("nameoncard"));
		click("purchasebtn_XPATH");
		Thread.sleep(2000);
		
		
	}
	
	

}

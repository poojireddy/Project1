package org.testng;

import java.io.IOException;

import org.adactinepage.PojoAdactinePage1;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample extends BaseClass {

	
	@BeforeClass
	
	private void OpenBrowser() {
		
		chromebrowser();
	    launchUrl("https://adactinhotelapp.com/");
	    maxWindow();
	    
	    }
	
	
	@AfterClass
	
	private void CloseBrowser() throws IOException {

		TakeSnapshot("login");
		closeCurrentBrowser();

    }
	
	@BeforeTest
	
	private void testCaseStarts() {

     Data();

	}
	
	
	@AfterTest
	
	private void testCaseEnds() {
		
		Data();
    }
	
	@Test
	
	private void TestCase1() throws IOException {

		  PojoAdactinePage1 login=new PojoAdactinePage1();
		  
		  WebElement user = login.getTxtUser();
		  
		  fillTextBox(user, readFromExcel("Data", 2, 1));
		  
		   String attr = user.getAttribute("value");
		   
		   Assert.assertEquals(attr, readFromExcel("Data",2, 1));


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

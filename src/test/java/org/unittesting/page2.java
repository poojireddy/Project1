package org.unittesting;

import java.io.IOException;

import org.adactinepage.PojoAdactinePage1;
import org.adactinepage.PojoAdactinePage2;
import org.adactinepage.PojoAdactinePage3;
import org.adactinepage.PojoAdaticPage4;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;
import org.testng.Assert;

public class page2 extends BaseClass{
	
@BeforeClass
	
	public static void openBrowser() {

    chromebrowser();
    launchUrl("https://adactinhotelapp.com/");
    maxWindow();

	}
	//@AfterClass
	
	public static void CloseBrowser() throws IOException {
		
		TakeSnapshot("login");
		closeCurrentBrowser();


	}
	
	@Before
	
	public  void testCaseStarts() {
		
		Data();
    }
	
	
	@After
	public void testCaseEnds() {
		
		Data();

    }
	
   @Test
	
	public void testcase1() throws IOException {
		
		PojoAdactinePage1 login=new PojoAdactinePage1();
		WebElement txtUser = login.getTxtUser();
		fillTextBox(txtUser, readFromExcel("Data", 1, 1));
		
		WebElement txtPass = login.getTxtPass();
		fillTextBox(txtPass, readFromExcel("Data", 2, 1));
		
		WebElement btnlogin = login.getBtnlogin();
		Click(btnlogin);
		
   }
   
   @Test
	public void testcase2() throws IOException {

     PojoAdactinePage2 page2=new PojoAdactinePage2();
     
     WebElement location = page2.getLocation();
     fillTextBox(location, readFromExcel("Data", 3, 1));
     Assert.assertEquals("London",readFromExcel("Data", 3, 1) );
     
     WebElement hotels = page2.getHotels();
     fillTextBox(hotels, readFromExcel("Data", 4, 1));
     Assert.assertEquals("Hotel Sunshine", readFromExcel("Data", 4, 1));
     
       WebElement rooms = page2.getRooms();
		fillTextBox(rooms, readFromExcel("Data", 5, 1));
		
		
		WebElement pickUp = page2.getPickUp();
		fillTextBox(pickUp, readFromExcel("Data", 6, 1));
		
		WebElement checkout = page2.getCheckout();
		fillTextBox(checkout,readFromExcel("Data", 7, 1));
		
		WebElement adult = page2.getAdult();
		fillTextBox(adult, readFromExcel("Data", 8, 1));
		
		WebElement child = page2.getChild();
		fillTextBox(child, readFromExcel("Data", 9, 1));
		
		WebElement submit = page2.getSubmit();
		Click(submit);
		
		}
	
	
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
	


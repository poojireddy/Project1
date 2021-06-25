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

public class Page3 extends BaseClass {
	
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
	
	
	
	
@Test
	
	public void testcase3() {
		
		PojoAdactinePage3 page3=new PojoAdactinePage3();
		WebElement btnRadio = page3.getBtnRadio();
		btnRadio.click();
		
		Assert.assertTrue(btnRadio.isSelected());
		
		WebElement conti = page3.getConti();
		Click(conti);


	}
	
	@Test
	
	public  void testcase4() throws IOException {
		
		
		PojoAdaticPage4 page4=new PojoAdaticPage4();
		WebElement name = page4.getName();
		fillTextBox(name, readFromExcel("Data", 10, 1));
		
		WebElement lastName = page4.getLastName();
		fillTextBox(lastName, readFromExcel("Data", 11, 1));
		
		WebElement address = page4.getAddress();
		fillTextBox(address, readFromExcel("Data", 12, 1));
		
		
		WebElement cardnum = page4.getCardnum();
		fillTextBox(cardnum, readFromExcel("Data", 13, 1));
		
		WebElement cardType = page4.getCardType();
		fillTextBox(cardType, readFromExcel("Data", 14, 1));
		
		WebElement expmonth = page4.getExpmonth();
		fillTextBox(expmonth, readFromExcel("Data", 15, 1));
		
		WebElement expyear = page4.getExpyear();
		fillTextBox(expyear, readFromExcel("Data", 16, 1));
		
		WebElement cvvNo = page4.getCvvNo();
		fillTextBox(cvvNo, readFromExcel("Data", 17, 1));
		
		WebElement book = page4.getBook();
		Click(book);
		
		timeWait(10);
		
       WebElement orderNo = page4.getOrderNo();
       	
       WriteInExcitingFile(20, 0, getattribute(orderNo));
		
		


	}
	


}

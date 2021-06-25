package org.unittesting;

import java.io.IOException;

import org.adactinepage.PojoAdactinePage1;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sample.BaseClass;



public class Page1 extends BaseClass{
	
	@BeforeClass
	
	public static void openBrowser() {

    chromebrowser();
    launchUrl("https://adactinhotelapp.com/");
    maxWindow();

	}
	//@AfterClass
	
	public static void CloseBrowser() throws IOException {
		
		

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
	
	public void NegativetestCase2() throws IOException, InterruptedException {
    
		PojoAdactinePage1 login=new PojoAdactinePage1();
		
		WebElement txtUser = login .getTxtUser();
		fillTextBox(txtUser, "poojitha" );
		
		WebElement txtPass = login .getTxtPass();
		fillTextBox(txtPass, readFromExcel("Data", 2, 1));
		
		WebElement btnlogin = login .getBtnlogin();
		Click(btnlogin);
		
		Thread.sleep(3000);
		
	
		WebElement message1 = driver.findElement(By.xpath("//a[text()='Click here']"));
		
		Click(message1);
		
	    String currentUrl = driver.getCurrentUrl();
		
	    Assert.assertTrue(currentUrl.contains("ForgotPassword.php"));

    
      }
	
	@Test
	
     public  void CheckAdacticimgtestcase1() throws InterruptedException {
		
		Thread.sleep(3000);
    	 
    	 WebElement image = driver.findElement(By.xpath("//img[@src='img/main-image-hotel-app.png']"));
    	 
    	 Assert.assertTrue(image.isDisplayed()	);



	}
	
	
	
	
}

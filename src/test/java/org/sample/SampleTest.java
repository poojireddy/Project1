package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		
	
		Thread.sleep(3000);

       launchBrowser();
		launchUrl("https://adactinhotelapp.com/");
		maxWindow();
		WebElement user = driver.findElement(By.id("username"));
		fillTextBox(user, "poojiprathap");
		WebElement pass = driver.findElement(By.id("password"));
		fillTextBox(pass, "poojitha@123");
		WebElement login = driver.findElement(By.id("login"));
		Click(login);
		
		WebElement location = driver.findElement(By.id("location"));
		dropDown(location, "London");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		dropDown(hotels, "Hotel Sunshine");
		
		WebElement room = driver.findElement(By.id("room_type"));
		dropDown(room, "Super Deluxe");
		
		WebElement rno = driver.findElement(By.id("room_nos"));
		dropDown(rno, "3 - Three");
		
		WebElement pickin = driver.findElement(By.id("datepick_in"));
		fillTextBox(pickin, "17/05/2021");
		
		WebElement checkout = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		fillTextBox(checkout, "21/05/2021");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		dropDown(adult,"2 - Two");
		
	    WebElement child=driver.findElement(By.id("child_room"));
	    dropDown(child, "1 - One");
	    
	    WebElement button = driver.findElement(By.id("Submit"));
	    Click(button);
		
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		Click(radio);
		
		WebElement con=driver.findElement(By.id("continue"));
		Click(con);
		
		WebElement name=driver.findElement(By.xpath("//input[@name='first_name']"));
		fillTextBox(name, "xydfr");
		
		WebElement last = driver.findElement(By.xpath("//input[@name='last_name']"));
		
	    fillTextBox(last, "tygfgh");
	    
	    WebElement add = driver.findElement(By.id("address"));
	    fillTextBox(add, "gffhfaj");
	    
	    WebElement cardNum = driver.findElement(By.id("cc_num"));
	    
	    fillTextBox(cardNum, "3456789034567567");
		
		WebElement cardType = driver.findElement(By.id("cc_type"));
		
		dropDown(cardType, "American Express");
		
		WebElement expMonth = driver.findElement(By.id("cc_exp_month"));
		
		dropDown(expMonth, "April");
		
		WebElement expYear = driver.findElement(By.id("cc_exp_year"));
		
		dropDown(expYear, "2022");
		WebElement cvvNum = driver.findElement(By.id("cc_cvv"));
		fillTextBox(cvvNum, "041");
		WebElement btnbookNow = driver.findElement(By.id("book_now"));
		Click(btnbookNow);
		timeWait(5);
		WebElement orderNo = driver.findElement(By.name("order_no"));
		getattribute(orderNo);
	    
	    
	}

}

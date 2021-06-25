package org.adactinepage;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.sample.BaseClass;

public class AutomatPage extends BaseClass{
	
	public static void main(String[] args) throws IOException {
		
		launchBrowser();
		launchUrl("https://adactinhotelapp.com/");
		maxWindow();
		
		PojoAdactinePage1 login=new PojoAdactinePage1();
		
		WebElement txtUser = login.getTxtUser();
		fillTextBox(txtUser, readFromExcel("Data", 1, 1));
		
		WebElement pass = login.getTxtPass();
		fillTextBox(pass, readFromExcel("Data", 2, 1));
		
		WebElement btnlogin = login.getBtnlogin();
		Click(btnlogin);
		
		PojoAdactinePage2 page2=new PojoAdactinePage2();
		
		WebElement location = page2.getLocation();
		fillTextBox(location, readFromExcel("Data", 3, 1));
		
		WebElement hotels = page2.getHotels();
		fillTextBox(hotels, readFromExcel("Data", 4, 1));
		
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
		
		PojoAdactinePage3 page3=new PojoAdactinePage3();
		WebElement btnRadio = page3.getBtnRadio();
		Click(btnRadio);
		
		WebElement conti = page3.getConti();
		Click(conti);
		
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

package org.adactinepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class PojoAdaticPage4 extends BaseClass {
	
	public PojoAdaticPage4() {
		
		PageFactory.initElements(driver, this);


	}
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement Name;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastName;
	
	@FindBy(id="address")
	WebElement address;
	
	@FindBy(id="cc_num")
	WebElement cardnum;
	
	@FindBy(id="cc_type")
	WebElement CardType;
	
	@FindBy(id="cc_exp_month")
	WebElement Expmonth;
	
	@FindBy(id="cc_exp_year")
	WebElement Expyear;
	
	@FindBy(id="cc_cvv")
	WebElement CvvNo;
	
	@FindBy(id="book_now")
	WebElement book;
	
	@FindBy(xpath="//input[@name='order_no']")
	WebElement orderNo;

	public WebElement getName() {
		return Name;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public WebElement getCardType() {
		return CardType;
	}

	public WebElement getExpmonth() {
		return Expmonth;
	}

	public WebElement getExpyear() {
		return Expyear;
	}

	public WebElement getCvvNo() {
		return CvvNo;
	}

	public WebElement getBook() {
		return book;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}
	
	 
	

}

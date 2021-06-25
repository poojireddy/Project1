package org.adactinepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class PojoAdactinePage1 extends BaseClass{
	
	public PojoAdactinePage1() {
		
		PageFactory.initElements(driver, this);


}
	
	
@FindBy(id="username") 
WebElement txtUser;

@FindBy(id="password")
WebElement txtPass;

@FindBy(id="login")
WebElement btnlogin;

public WebElement getTxtUser() {
	return txtUser;
}
public WebElement getTxtPass() {
	return txtPass;
}
public WebElement getBtnlogin() {
	return btnlogin;
}

		}

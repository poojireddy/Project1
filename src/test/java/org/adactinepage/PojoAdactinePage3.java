package org.adactinepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class PojoAdactinePage3 extends BaseClass {
	
	public PojoAdactinePage3() {

     PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	WebElement btnRadio;
	
	@FindBy(id="continue")
	WebElement conti;

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getConti() {
		return conti;
	}

}

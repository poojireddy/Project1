package org.adactinepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sample.BaseClass;

public class PojoAdactinePage2 extends BaseClass {
	
	public PojoAdactinePage2() {
		
		PageFactory.initElements(driver, this);


	}
	
	@FindBy(id="location")
	WebElement Location;
	
	@FindBy(id="hotels") 
	WebElement hotels;
	
	@FindBy(id="room_type") 
	WebElement rooms;
	
	@FindBy(id="room_nos")
	WebElement RoomNo;
	
	@FindBy(id="datepick_in")
	WebElement pickUp;
	
	@FindBy(xpath="//input[@id='datepick_out']")
	WebElement checkout;
	
	@FindBy(id="adult_room")
	WebElement adult;
	
	@FindBy(id="child_room")
	WebElement child;
	
	@FindBy(id="Submit")
	WebElement Submit;

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getRoomNo() {
		return RoomNo;
	}

	public WebElement getPickUp() {
		return pickUp;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmit() {
		return Submit;
	}

}

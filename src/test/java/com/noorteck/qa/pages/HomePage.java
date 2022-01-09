package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class HomePage extends CommonUI{

	@FindBy(xpath = "//a[text() = 'REGISTER']")
	WebElement registerButton;
	
	@FindBy(xpath = "//a[text() = 'SIGN-ON']")
	WebElement signOnButton;
	
	@FindBy(xpath = "//a[text() = 'Flights']")
	WebElement flightsButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickRegister() {
		click(registerButton);
	}
	
	public void clickSignOn() {
		click(signOnButton);
	}
	
	public void clickFlights() {
		click(flightsButton);
	}
}

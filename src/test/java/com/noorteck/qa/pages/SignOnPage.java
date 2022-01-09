package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class SignOnPage extends CommonUI{

	@FindBy(xpath = "//input[@name = 'userName']")
	WebElement userNameField;
	
	@FindBy(xpath = "//input[@name = 'password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//input[@name = 'submit']")
	WebElement submitButton;
	
	public SignOnPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String userName) {
		enter(userNameField, userName);
	}
	
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	
	public void clickSubmit() {
		click(submitButton);
	}
}
//TODO Login Succefully
//TODO Thank you for Loggin
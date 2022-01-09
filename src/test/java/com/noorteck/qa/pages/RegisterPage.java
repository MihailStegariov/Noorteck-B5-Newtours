package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class RegisterPage extends CommonUI{

	@FindBy(xpath = "//input[@name = 'firstName']")
	WebElement firstNameField;
	
	@FindBy(xpath = "//input[@name = 'lastName']")
	WebElement lastNameField;
	
	@FindBy(xpath = "//input[@name = 'phone']")
	WebElement phoneNumberField;
	
	@FindBy(xpath = "//input[@name = 'userName']")
	WebElement emailField;
	
	@FindBy(xpath = "//input[@name = 'address1']")
	WebElement addressField;
	
	@FindBy(xpath = "//input[@name = 'city']")
	WebElement cityField;
	
	@FindBy(xpath = "//input[@name = 'state']")
	WebElement stateProvinceField;
	
	@FindBy(xpath = "//input[@name = 'postalCode']")
	WebElement postalCodeField;
	
	@FindBy(xpath = "//select[@name = 'country']")
	WebElement countryDropDown;
	
	@FindBy(xpath = "//input[@name = 'email']")
	WebElement userNameField;
	
	@FindBy(xpath = "//input[@name = 'password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//input[@name = 'confirmPassword']")
	WebElement confirmPasswordField;
	
	@FindBy(xpath = "//input[@name = 'submit']")
	WebElement submitButton;
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	public void enterFirstName(String firstName) {
		enter(firstNameField, firstName);
	}
	public void enterLastName(String lastName) {
		enter(lastNameField, lastName);
	}
	public void enterPhone(String phone) {
		enter(phoneNumberField, phone);
	}
	public void enterEmail(String email) {
		enter(emailField, email);
	}
	public void enterAddress(String address) {
		enter(addressField, address);
	}
	public void enterCity(String city) {
		enter(cityField, city);
	}
	public void enterStateProvince(String stateProvince) {
		enter(stateProvinceField, stateProvince);
	}
	public void enterPostalCode(String postalCode) {
		enter(postalCodeField, postalCode);
	}
	public void selectCountry(String methodName, String indexTextValue) {
		selectFromDropdown(countryDropDown, methodName, indexTextValue);
	}
	public void enterUserName(String userName) {
		enter(userNameField, userName);
	}
	public void enterPassword(String password) {
		enter(passwordField, password);
	}
	public void enterConfirmPassword(String confirmPassword) {
		enter(confirmPasswordField, confirmPassword);
	}
	public void clickSubmit() {
		click(submitButton);
	
		
	}
}

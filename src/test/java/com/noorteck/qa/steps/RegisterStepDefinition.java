package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterStepDefinition extends ObjInitialize{

	String url = "https://demo.guru99.com/test/newtours/register.php";
	
	@Given("User is on register page")
	public void user_is_on_register_page() {
	  
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
	}

	@When("User enters first name")
	public void user_enters_first_name() {
	  registerObj.enterFirstName("Mihail");
	}

	@When("User enters last name")
	public void user_enters_last_name() {
registerObj.enterLastName("Stegariov");
	}

	@When("User enters phone number")
	public void user_enters_phone_number() {
	    registerObj.enterPhone("123456789");
	}

	@When("User enters email")
	public void user_enters_email() {
	   registerObj.enterEmail("john_cena@gmail.com");
	}

	@When("User enters address")
	public void user_enters_address() {
	    registerObj.enterAddress("1234 New Ridge Rd");
	}

	@When("User enters city")
	public void user_enters_city() {
	registerObj.enterCity("Chisinau");
	}

	@When("User enters state")
	public void user_enters_state() {
	   registerObj.enterStateProvince("Maryland");
	}

	@When("User enters postal code")
	public void user_enters_postal_code() {
	   registerObj.enterPostalCode("20906");
	}

	@When("User choosing country")
	public void user_choosing_country() {
	   registerObj.selectCountry("value", "CANADA");
	}

	@When("User enters confirm password")
	public void user_enters_confirm_password() {
	    registerObj.enterConfirmPassword("12345");
	    
	    System.out.println(CommonUI.getTitle());
	    
	    CommonUI.quitBrowser();
	}

}

package com.noorteck.qa.steps;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignOnStepDefinition extends ObjInitialize{

	String url = "https://demo.guru99.com/test/newtours/login.php";

	
	@Given("User is on sign on page")
	public void user_is_on_sign_on_page() {
	   
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
	}

	@When("User enters username")
	public void user_enters_username() {
	   
		signOnObj.enterUserName("Mihail");
	}

	@When("User enters password")
	public void user_enters_password() {
	   
		signOnObj.enterPassword("Mihail123");
	}

	@When("User clicks submit button")
	public void user_clicks_submit_button() {
	   
		signOnObj.clickSubmit();
	}

	@Then("User lands on dashboard page")
	public void user_lands_on_dashboard_page() {
	    
		System.out.println(CommonUI.getTitle());
		
		CommonUI.quitBrowser();
	}


}

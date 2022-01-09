package com.noorteck.qa.test;

import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.ObjInitialize;

public class NewtourTest extends ObjInitialize {

	public static void main(String[] args) {

		String url = "https://demo.guru99.com/test/newtours/";
		CommonUI.openBrowser("chrome");
		CommonUI.navigate(url);
		initializeClassObj();
		signOnTest();
		registerTest();
		flightsTest();
		CommonUI.quitBrowser();

	}

	public static void signOnTest() {
		homeObj.clickSignOn();
		signOnObj.enterUserName("John");
		signOnObj.enterPassword("98765");
		signOnObj.clickSubmit();
		// TODO signOnObj.login succesfully
		// TODO signOnObj.Login Thank you

	}

	public static void registerTest() {
		homeObj.clickRegister();
		registerObj.enterFirstName("John");
		registerObj.enterLastName("Lackey");
		registerObj.enterPhone("123-456-7890");
		registerObj.enterEmail("john_lackey@gmail.com");
		registerObj.enterAddress("7466 New Ridge Road");
		registerObj.enterCity("Hanover");
		registerObj.enterStateProvince("VA");
		registerObj.enterPostalCode("20906");
		registerObj.selectCountry("value", "CANADA");
		registerObj.enterUserName("JohnLackey");
		registerObj.enterPassword("Pass1234556");
		registerObj.enterConfirmPassword("Pass1234556");
		registerObj.clickSubmit();
		// registerObj Verify if message if displayed

	}

	public static void flightsTest() {
		homeObj.clickFlights();
		flightsObj.clickOneWay();
		flightsObj.selectPassengers("value", "3");
		flightsObj.selectDepartingFrom("value", "New York");
		flightsObj.selectOnMonth("text", "January ");
		flightsObj.selectOnDay("value", "5");
		flightsObj.selectArringIn("value", "London");
		flightsObj.selectReturnDay("value", "31");
		flightsObj.clickFirstClass();
		flightsObj.selectAirline("text", "Unified Airlines");
		flightsObj.clickContinue();
		flightsObj.flightFinderMessage();

	}
}

/**
 * -------------------------------------- INSTRUCTIONS
 * --------------------------------------------
 * 
 * ---> Create JAVA CLASS for each page of the application ---> Inspect the
 * elements and store the values ---> Create the class constructor ---> Create
 * the methods
 * 
 * ---> DONT FORGET ***** EACH PAGE CLASS SHOULD INHERIT CommonUI Class
 * ******************* ---> DONT FORGET ***** DECLARE PAGE CLASS OBJECT in
 * CONSTANTS CLASS ******************* ---> DONT FOGET ***** INITIALIZE PAGE
 * CLASS OBJECTS IN ObjInitialize JAVA ClASS ******************* ---> DONT FOGET
 * ***** CHANGE JAVA VERSION TO 1.8 *******************
 * 
 * 
 * 
 * ---> For each test case create a method then call those methods from main
 * method. ---> DONT FORGET ***** Refer to the INSTRUCTION PDF file for the test
 * cases to automate **************
 * 
 * ---> ONCE FINISHED AUTOMATING Create Repository in GitHub and push to GitHub
 * ---> Once pushed add US to the project then send picture in MENTORS GROUP
 * CHAT Crystal: --> Koritzerc23@gmail.com Helen: --> Hnbehining@gmail.com
 * Ahmad: --> a.stanikzai77@gmail.com Fahim: --> NTKBatch5
 * 
 * 
 */
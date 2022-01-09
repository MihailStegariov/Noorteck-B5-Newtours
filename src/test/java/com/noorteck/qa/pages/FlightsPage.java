package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class FlightsPage extends CommonUI {

	@FindBy(xpath = "//*[@value = 'roundtrip']")
	WebElement roundTripRadio;

	@FindBy(xpath = "//*[@value = 'oneway']")
	WebElement oneWayRadio;

	@FindBy(xpath = "//*[@name = 'passCount']")
	WebElement passengersDropDown;

	@FindBy(xpath = "//*[@name = 'fromPort']")
	WebElement departingFromDropDown;

	@FindBy(xpath = "//*[@name = 'fromDay']")
	WebElement onDayDropDown;

	@FindBy(xpath = "//*[@name = 'fromMonth']")
	WebElement onMonthDropDown;

	@FindBy(xpath = "//*[@name = 'toPort']")
	WebElement arrivingInDropDown;

	@FindBy(xpath = "//*[@name = 'toDay']")
	WebElement returnDayDropDown;

	@FindBy(xpath = "//*[@name = 'toMonth']")
	WebElement returnMonthDropDown;

	@FindBy(xpath = "//input[@value = 'Coach']")
	WebElement economyClassRadio;

	@FindBy(xpath = "//input[@value = 'Business']")
	WebElement businessClassRadio;

	@FindBy(xpath = "//input[@value = 'First']")
	WebElement firstClassRadio;

	@FindBy(xpath = "//*[@name = 'airline']")
	WebElement airlineDropDown;

	@FindBy(xpath = "//*[@name = 'findFlights']")
	WebElement continueButton;
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[1]/td/p/font/b/font[1]")
	WebElement flightFinderMessage;

	// TODO Text After flight finder - No seats available

	public FlightsPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickroundTrip() {
		click(roundTripRadio);
	}

	public void clickOneWay() {
		click(oneWayRadio);
	}

	public void selectPassengers(String methodName, String indexTextValue) {
		selectFromDropdown(passengersDropDown, methodName, indexTextValue);
	}

	public void selectDepartingFrom(String methodName, String indexTextValue) {
		selectFromDropdown(departingFromDropDown, methodName, indexTextValue);
	}

	public void selectOnDay(String methodName, String indexTextValue) {
		selectFromDropdown(onDayDropDown, methodName, indexTextValue);

	}

	public void selectOnMonth(String methodName, String indexTextValue) {
		selectFromDropdown(onMonthDropDown, methodName, indexTextValue);
	}
	public void selectArringIn(String methodName, String indexTextValue) {
		selectFromDropdown(arrivingInDropDown, methodName, indexTextValue);
	}
	public void selectReturnDay(String methodName, String indexTextValue) {
		selectFromDropdown(returnDayDropDown, methodName, indexTextValue);
	}
	public void selectReturnMonth(String methodName, String indexTextValue) {
		selectFromDropdown(returnMonthDropDown, methodName, indexTextValue);
	}
	public void clickEconomyClass() {
		click(economyClassRadio);
	}
	public void clickBusinessClass() {
		click(businessClassRadio);
	}
	public void clickFirstClass() {
		click(firstClassRadio);
	}
	public void selectAirline(String methodName, String indexTextValue) {
		selectFromDropdown(airlineDropDown, methodName, indexTextValue);
	}
	public void clickContinue() {
		click(continueButton);
	}
	public void flightFinderMessage() {
		isDisplayed(flightFinderMessage);
	}
}

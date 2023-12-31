package com.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import com.day2.Browser;
import com.day2.BrowserUtility;

/*
 * variables -- Locators
 * Functions or method -- functionalities of the page (needs to return something)
 */

public final class LoginPage extends BrowserUtility {
	
	private static final By USER_NAME_TEXTBOOK_LOCATORS = By.id("username");
	private static final By PASSWORD_TEXTBOOK_LOCATORS = By.id("password");
	private static final By SIGN_IN_BUTTON_LOCATORS = (By.xpath( "//span[contains(text(),\"Sign in\")]/../.."));
	

//Every other class is to have only this first constructor not the second one. The second one is only for login classes
	public LoginPage(WebDriver wd) {
		super(wd);			//Constructor chaining 
		// TODO Auto-generated constructor stub
	}
	
	
	public LoginPage(Browser browser) {
		super(browser);		//Browser.CHROME
		goToWebsite("https://www.phoenix.testautomationacademy.in/sign-in");
		// TODO Auto-generated constructor stub---- To enable LoginPage object creation in LoginDetails
	}


	public DashBoardPage doLoginAs (String userName, String password) {
		enterText(USER_NAME_TEXTBOOK_LOCATORS, userName);//Open LoginDetails iamfd
		enterText(PASSWORD_TEXTBOOK_LOCATORS, password);//password
		clickOnButton(SIGN_IN_BUTTON_LOCATORS);
		DashBoardPage dashBoardPage = new DashBoardPage(getWd());
		return dashBoardPage;
		//dashboardpage is returned because it is the next page after the login has been done
	
		
		
	}
	
	
	

}

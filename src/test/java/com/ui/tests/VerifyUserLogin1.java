package com.ui.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.day2.Browser;
import com.ui.pages.LoginPage;


public class VerifyUserLogin1 {

	private LoginPage loginPage ; 
	
	@BeforeMethod (description = "setup of the browser")
	
	public void setup() {
		loginPage = new LoginPage(Browser.CHROME);
	}
	@Test
	public void verifyUserLogin() {
		
		
		Assert.assertEquals(loginPage.doLoginAs("iamfd", "password").getUserName(), "iamfd");;

	}

}

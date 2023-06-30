package com.ui.tests;

import com.day2.Browser;
import com.ui.pages.LoginPage;


public class Runner {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage loginPage = new LoginPage(Browser.CHROME);
		loginPage.doLoginAs("iamfd", "password").and().searchforJobUsing("JOB_23204");

	}

}

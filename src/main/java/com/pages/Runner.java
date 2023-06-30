package com.pages;

import com.day2.Browser;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage loginPage = new LoginPage(Browser.CHROME);
		loginPage.doLoginAs("iamfd", "password").and().searchforJobUsing(null);

	}

}

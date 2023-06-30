package com.day2;

import com.pages.DashBoardPage;
import com.pages.LoginPage;

public class DashBoardScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage loginPage = new LoginPage(Browser.CHROME);
		DashBoardPage dashBoardPage = loginPage.doLoginAs("ïamfd", "password");
		System.out.println(dashBoardPage.getTotalPendingForDeliveryJobsCount() );
		dashBoardPage.searchforJobUsing("JOB_23204");
		

	}

}

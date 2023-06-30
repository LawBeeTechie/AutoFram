package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.day2.BrowserUtility;

public class DashBoardPage extends BrowserUtility {
	
	private static final By PENDING_FOR_DELIVERY_LOCATOR = 
			By.xpath("//div[contains(text(),\"Pending for delivery\")]/../div/button");
	private static final By SEARCH_TEXTBOOK_LOCATOR = 
			By.xpath("//input[@placeholder=\"Search for a Job or IMEI\"]");
	private static final By USER_ICON_LOCATOR =
			By.xpath("//mat-icon[@data-mat-icon-name=\"user-circle\"]"); 
	private static final By USERNAME_LOCATOR =
			By.xpath("//span[contains(text(),\"Signed in as\")]/../span[2]");
	private static final By CREATE_JOB_LINK_LOCATOR =
			By.xpath("//span[contains(text(),\"Create Job\")]/../..");
	public DashBoardPage(WebDriver wd) {
		super(wd);
		// TODO Auto-generated constructor stub
	}

	public String getTotalPendingForDeliveryJobsCount() {
		String data = getVisibleText(PENDING_FOR_DELIVERY_LOCATOR);
		return data;
	} 
	
	public void searchforJobUsing(String imeiOrJobNumber) {
		enterText(SEARCH_TEXTBOOK_LOCATOR, imeiOrJobNumber);
		enterText(SEARCH_TEXTBOOK_LOCATOR, Keys.ENTER);
	}
	
	public DashBoardPage and() {
		return new DashBoardPage(getWd());
		
	}

	public String getUserName() {
		clickOnButton(USER_ICON_LOCATOR);
		return getVisibleText(USERNAME_LOCATOR);
	}
	
	public CreateJobPage goToCreateJobPage() {
		clickOnButton(CREATE_JOB_LINK_LOCATOR );
		return new CreateJobPage(getWd());
	}
	
	
	
}
//GlobalListPage globalListPage = new GlobalListPage(getWd());
//globalistpage is returned because when you searchjob it takes u to globallist page

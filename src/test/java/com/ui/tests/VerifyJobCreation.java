package com.ui.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.day2.Browser;
import com.ui.pages.LoginPage;
import com.ui.pojo.CreateNewJobData;
import com.utils.TestUtility;

public class VerifyJobCreation {
private LoginPage loginPage ; 
private CreateNewJobData createNewJobData;
	
	@BeforeMethod (description = "setup of the browser")
	public void setup() {
		loginPage = new LoginPage(Browser.CHROME);
		createNewJobData = TestUtility.getCreateJobUIData();
		
	}
	
	@Test
	public void createJobTest() {
		String jobnumber = loginPage.doLoginAs("iamfd", "password").goToCreateJobPage().createJob(createNewJobData);;
	Assert.assertTrue(TestUtility.notNull(jobnumber));
	
	
	}

	
}

package com.ui.stepdefiniton;

import org.testng.Assert;

import com.day2.Browser;
import com.ui.pages.DashBoardPage;
import com.ui.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefiniton {
	private LoginPage loginPage ; 

	private DashBoardPage dashBoardPage;
@Given("the user launches the {string} browser and is on login page")
public void the_user_launches_the_browser_and_is_on_login_page(String browser) {
    // Write code here that turns the phrase above into concrete actions
	loginPage = new LoginPage(Browser.CHROME);

}

@When("the user enters the credentials {string} and {string}")
public void the_user_enters_the_credentials_and(String userName, String password) {
    // Write code here that turns the phrase above into concrete actions
	 dashBoardPage = loginPage.doLoginAs(userName, password);
}

@Then("the user should see the userName under userIcon")
public void the_user_should_see_the_user_name_under_user_icon() {
    // Write code here that turns the phrase above into concrete actions
    Assert.assertEquals(dashBoardPage.getUserName(), "iamfd");
}



}

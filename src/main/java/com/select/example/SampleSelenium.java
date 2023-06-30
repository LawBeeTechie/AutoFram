package com.select.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleSelenium {

	public static void main(String[] args) throws InterruptedException {
		// Handling Drop down with selenium using Select.
		WebDriverManager.chromedriver().setup(); //Setup
		WebDriver wd = new ChromeDriver();
		wd.get("https://https://139.59.91.96:5001/selenium-workbook/registration-form.html");//baseURL
		
		wd.manage().window().maximize();	// Maximize
		Thread.sleep(50000);				// Delay
		
		By hearAboutDropDownLocator = By.name("hearAbout");	//Locator
		WebElement hearAboutDropDownElement = wd.findElement(hearAboutDropDownLocator); //Webelement
		
		Select hearAboutDropDown = new Select(hearAboutDropDownElement);	//Selecting the dropdown option
		hearAboutDropDown.selectByVisibleText("Friend");	//Selecting webelement ByVisibleText
		Thread.sleep(3000);
		hearAboutDropDown.selectByVisibleText("Advert");
		
		By productYouAreInteresedInDropDown = By.name("interest");
		WebElement productYouAreInteresedInElement = wd.findElement(productYouAreInteresedInDropDown);
		Select productYouAreInteresedIn = new Select(productYouAreInteresedInElement);
		productYouAreInteresedIn.selectByIndex(0);	//Selecting webelement ByIndex
		
		Thread.sleep(4000);
		productYouAreInteresedIn.selectByIndex(1);
		

	}

}

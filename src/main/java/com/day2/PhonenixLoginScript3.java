package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.day2.Browser.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PhonenixLoginScript3 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub....  you can write this as Browser.CHROME or do a static
												//import and write as just CHROME.Check line 9
		BrowserUtility bu = new BrowserUtility(Browser.CHROME); // the screaming is due to the fact i have name the browserUtility class as abstract because one object of thr class has to be created
		bu.goToWebsite("https://www.phoenix.testautomationacademy.in/sign-in");//enter the webpage
		bu.maximizeTheWindow();			//maximize the webpage
		bu.enterText(By.id("username"), "iamsup"); //use By to find the element and .sendkeys //string//
		bu.enterText(By.id("password"), "password");
		bu.clickOnButton(By.xpath( "//span[contains(text(),\"Sign in\")]/../.."));// The \ is to ignore the double quote
		bu.clickOnButton(By.xpath("//span[contains(text(),\"Create Job\")]/../.."));
		bu.enterText(By.xpath("//input[@formcontrolname='imeiNo1']"), "1232435356");
		bu.enterText(By.xpath("//input[@id='mat-input-4']"), "3/10/23");
		bu.enterText(By.xpath("//input[@placeholder='Remarks']"), "Test");
		bu.enterText(By.xpath("//input[@formcontrolname='firstName']"), "Test");
		bu.enterText(By.xpath("//input[@formcontrolname='lastName']"), "Test");
		bu.enterText(By.xpath("//input[@formcontrolname='contactNo']"), "101010101");
		
		//Automating Custom Drop down
		bu.selectFromDropDown("oem", "Apple");
		bu.selectFromDropDown("id", "Sync Issue");
		bu.selectFromDropDown("productName", "Iphone");
		
		
		
	/*	
	Automating Custom Drop down RAW
	
		By oemDropDownLocator = By.xpath("//mat-select[@placeholder=\"Select OEM\"]");
		bu.clickOnButton(oemDropDownLocator);
		
	Goggle,LG,Apple are options you can change according to the dropdown. write the code in 
		//this format and input the String value
		 *  
		String oemName = "Goggle";
		By oemNameLocator = By.xpath("//span[contains@(text(),'" + oemName + "')]/..");
		bu.clickOnButton(oemNameLocator);		
	*/	
		
	

	}
 
}

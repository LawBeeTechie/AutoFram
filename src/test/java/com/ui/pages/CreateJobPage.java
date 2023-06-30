package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.day2.BrowserUtility;
import com.ui.pojo.CreateNewJobData;
import com.utils.TestUtility;


public class CreateJobPage extends BrowserUtility {
	private static final By IMEI_TEXT_BOX_LOCATOR = (By.xpath("//input[@formcontrolname='imeiNo1']"));
	private static final By DATE_LOCATOR = (By.xpath("//input[@id='mat-input-4']"));
	private static final By REMARK_LOCATOR = (By.xpath("//input[@placeholder='Remarks']"));
	private static final By FIRST_NAME_LOCATOR = (By.xpath("//input[@formcontrolname='firstName']"));
	private static final By LAST_NAME_LOCATOR= (By.xpath("//input[@formcontrolname='lastName']"));
	private static final By CONTACT_NO_LOCATOR = (By.xpath("//input[@formcontrolname='contactNo']"));
	private static final By AREA_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Area']");
	private static final By PIN_CODE_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Pincode']");
	private static final By STREET_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Street Name'");
	private static final By FLAT_NUMBER_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Flat/Society No. ']");
	private static final By LANDMARK_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Choose a Landmark']");
	private static final By EMAIL_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Email Id']");
	private static final By APARTMENT_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Apartment Name']");
	private static final By STATE_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='State Name']");
	private static final By SUBMIT_BUTTON_LOCATOR = By.xpath("//span[contains(text(),'Submit')]/..");
	private static final By JOB_TOAST_LOCATOR = By.xpath("	//span[contains(text(),\'Job created successfully\')]");


	
	public CreateJobPage(WebDriver wd) {
		super(wd);
		// TODO Auto-generated constructor stub
	}

	public String createJob(CreateNewJobData createJobData) {
		enterText(IMEI_TEXT_BOX_LOCATOR, createJobData.getDeviceDetails().getImeiName());
		selectFromDropDown("oem", createJobData.getDeviceDetails().getOemName());
		selectFromDropDown("id", createJobData.getProblemDetails().getProblem());
		selectFromDropDown("productName", createJobData.getDeviceDetails().getProductName());
		selectFromDropDown("warrantyStatus", createJobData.getDeviceDetails().getWarrantyStatus());
		selectFromDropDown("modelName", createJobData.getDeviceDetails().getModelName());
		
		enterText(DATE_LOCATOR, createJobData.getDeviceDetails().getDop());
		enterText(REMARK_LOCATOR, createJobData.getProblemDetails().getRemarks());
		enterText(FIRST_NAME_LOCATOR, createJobData.getCustomerInfo().getFirst_name());
		enterText(LAST_NAME_LOCATOR, createJobData.getCustomerInfo().getLast_name());
		enterText(CONTACT_NO_LOCATOR, createJobData.getCustomerInfo().getMobile_number());
		enterText(AREA_NAME_TEXT_BOX_LOCATOR, createJobData.getCustomerAddressInfo().getArea());
		enterText(PIN_CODE_TEXT_BOX_LOCATOR, createJobData.getCustomerAddressInfo().getPincode());
		enterText(STREET_NAME_TEXT_BOX_LOCATOR, createJobData.getCustomerAddressInfo().getStreet_name());
		enterText(FLAT_NUMBER_TEXT_BOX_LOCATOR, createJobData.getCustomerAddressInfo().getFlat_number());
		enterText(EMAIL_TEXT_BOX_LOCATOR, createJobData.getCustomerInfo().getEmail_id());
		enterText(APARTMENT_NAME_TEXT_BOX_LOCATOR, createJobData.getCustomerAddressInfo().getApartment_name());
		enterText(LANDMARK_TEXT_BOX_LOCATOR, createJobData.getCustomerAddressInfo().getLandmark());
		enterText(STATE_NAME_TEXT_BOX_LOCATOR, createJobData.getCustomerAddressInfo().getStreet_name());
		clickOnButton(SUBMIT_BUTTON_LOCATOR);
		
		System.out.println(TestUtility.getJobNumberFromToastMsg(getText(JOB_TOAST_LOCATOR))) ;
		return TestUtility.getJobNumberFromToastMsg(getText(JOB_TOAST_LOCATOR));
	}
	


}


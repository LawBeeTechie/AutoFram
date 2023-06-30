package com.ui.pojo;

import com.api.pojo.Customer;


public class CreateNewJobData {
	 
	private DeviceDetailsPojo deviceDetails;
	private ProblemsDetailsPojo problemDetails;
	private Customer customerInfo;
	private CustomerAddress1 customerAddressInfo;
	public CreateNewJobData(DeviceDetailsPojo deviceDetails, ProblemsDetailsPojo problemDetails, Customer customerInfo,
			CustomerAddress1 customerAddressInfo) {
		super();
		this.deviceDetails = deviceDetails;
		this.problemDetails = problemDetails;
		this.customerInfo = customerInfo;
		this.customerAddressInfo = customerAddressInfo;
	}
	public DeviceDetailsPojo getDeviceDetails() {
		return deviceDetails;
	}
	public void setDeviceDetails(DeviceDetailsPojo deviceDetails) {
		this.deviceDetails = deviceDetails;
	}
	public ProblemsDetailsPojo getProblemDetails() {
		return problemDetails;
	}
	public void setProblemDetails(ProblemsDetailsPojo problemDetails) {
		this.problemDetails = problemDetails;
	}
	public Customer getCustomerInfo() {
		return customerInfo;
	}
	public void setCustomerInfo(Customer customerInfo) {
		this.customerInfo = customerInfo;
	}
	public CustomerAddress1 getCustomerAddressInfo() {
		return customerAddressInfo;
	}
	public void setCustomerAddressInfo(CustomerAddress1 customerAddressInfo) {
		this.customerAddressInfo = customerAddressInfo;
	}
	
	@Override
	public String toString() {
		return "CreateNewJobData [deviceDetails=" + deviceDetails + ", problemDetails=" + problemDetails
				+ ", customerInfo=" + customerInfo + ", customerAddressInfo=" + customerAddressInfo + "]";
	}
	

}

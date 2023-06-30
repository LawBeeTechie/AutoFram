package com.ui.pojo;

public class CustomerDetails {
	private String firstName;
	private String lastName;
	private String contactNo;
	private String altContactNo;
	private String emailId;
	private String altEmailId;
	private String no;
	private String apartmentName;
	private String landmark;
	private String streetName;
	private String area;
	private String country;
	private String state;
	private String pincode;
	private String serviceLocation;
	public CustomerDetails(String firstName, String lastName, String contactNo, String altContactNo, String emailId,
			String altEmailId, String no, String apartmentName, String landmark, String streetName, String area,
			String country, String state, String pincode, String serviceLocation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNo = contactNo;
		this.altContactNo = altContactNo;
		this.emailId = emailId;
		this.altEmailId = altEmailId;
		this.no = no;
		this.apartmentName = apartmentName;
		this.landmark = landmark;
		this.streetName = streetName;
		this.area = area;
		this.country = country;
		this.state = state;
		this.pincode = pincode;
		this.serviceLocation = serviceLocation;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAltContactNo() {
		return altContactNo;
	}
	public void setAltContactNo(String altContactNo) {
		this.altContactNo = altContactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAltEmailId() {
		return altEmailId;
	}
	public void setAltEmailId(String altEmailId) {
		this.altEmailId = altEmailId;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getServiceLocation() {
		return serviceLocation;
	}
	public void setServiceLocation(String serviceLocation) {
		this.serviceLocation = serviceLocation;
	}
	@Override
	public String toString() {
		return "CustomerDetails [firstName=" + firstName + ", lastName=" + lastName + ", contactNo=" + contactNo
				+ ", altContactNo=" + altContactNo + ", emailId=" + emailId + ", altEmailId=" + altEmailId + ", no="
				+ no + ", apartmentName=" + apartmentName + ", landmark=" + landmark + ", streetName=" + streetName
				+ ", area=" + area + ", country=" + country + ", state=" + state + ", pincode=" + pincode
				+ ", serviceLocation=" + serviceLocation + "]";
	}
	
	
	
}

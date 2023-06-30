package com.ui.pojo;

public class DeviceDetailsPojo {
	private String oemName;
	private String productName;
	private String modelName;
	private String imeiName;
	private String dop;
	private String warrantyStatus;

	public DeviceDetailsPojo(String oemName, String productName, String modelName, String dop,
			String warrantyStatus) {
		super();
		this.oemName = oemName;
		this.productName = productName;
		this.modelName = modelName;
		this.imeiName = imeiName;
		this.dop = dop;
		this.warrantyStatus = warrantyStatus;
	}
	public String getOemName() {
		return oemName;
	}
	public void setOemName(String oemName) {
		this.oemName = oemName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getImeiName() {
		return imeiName;
	}
	public void setImeiName(String imeiName) {
		this.imeiName = imeiName;
	}
	public String getDop() {
		return dop;
	}
	public void setDop(String dop) {
		this.dop = dop;
	}

	public String getWarrantyStatus() {
		return warrantyStatus;
	}

	public void setWarrantyStatus(String warrantyStatus) {
		this.warrantyStatus = warrantyStatus;
	}

	@Override
	public String toString() {
		return "DeviceDetailsPojo [oemName=" + oemName + ", productName=" + productName + ", modelName=" + modelName
				+ ", imeiName=" + imeiName + ", dop=" + dop + ", warrantyStatus=" + warrantyStatus + "]";
	}
	

}

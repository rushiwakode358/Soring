package com.javaConfiguration;

public class Customer {

	private int customerId;
	private String customerName;
	private String customerAddress;

	public Customer() {
		super();
	}

	public Customer(int customerId, String customerName, String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	

	public void setcustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setcustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "Employee [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress=" + customerAddress + "]";
	}

}

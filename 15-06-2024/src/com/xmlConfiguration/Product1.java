package com.xmlConfiguration;

public class Product1 {

	private int productId;
	private String productName;
	private double productPrice;

	public Product1() {
		super();
	}

	public Product1(int productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public void setproductId(int productId) {
		this.productId = productId;
	}

	public void setproductName(String productName) {
		this.productName = productName;
	}

	public void setproductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

}

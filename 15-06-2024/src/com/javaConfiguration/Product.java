package com.javaConfiguration;

public class Product {

	private int productId;
	private String productName;
	private double productPrice;

	public Product() {
		super();
	}

	public Product(int productId, String productName, double productPrice) {
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

package com.javaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestContainer {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ProductConfiguration.class);

		// create Object product
		Product product = (Product) context.getBean("product");

		product.setproductId(1);
		product.setproductName("Earbuds");
		product.setproductPrice(45863);

		System.out.println(product.toString());

	}

}

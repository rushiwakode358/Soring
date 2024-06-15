package com.xmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer1 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Product product = new Product();
		Product1 product = (Product1) context.getBean("product");

		System.out.println(product.toString());
		
		Product1 product2 = (Product1) context.getBean("product2");

		System.out.println(product2.toString());

	}

}

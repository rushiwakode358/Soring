package com.javaConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestContainer {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfiguration.class);

		// create Object employee
		Customer employee = (Customer) context.getBean("customer");
		
		employee.setcustomerId(1);
		employee.setcustomerName("Rushikesh");
		employee.setcustomerAddress("Pune");

		System.out.println(employee.toString());

	}

}

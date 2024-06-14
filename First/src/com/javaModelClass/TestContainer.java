package com.javaModelClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Product product = new Product();
		Employee employee = (Employee) context.getBean("employee");

		System.out.println(employee.toString());

	}

}

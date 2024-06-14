package com.javaModelClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Employee employee = (Employee) context.getBean("employee");

		System.out.println(employee.toString());

		Employee employee2 = (Employee) context.getBean("employee2");

		System.out.println(employee2.toString());

	}

}

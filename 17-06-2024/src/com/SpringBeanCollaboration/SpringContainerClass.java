package com.SpringBeanCollaboration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainerClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");

		Employee employee = (Employee) context.getBean("employee1");

		System.out.println(employee.toString());

	}

}

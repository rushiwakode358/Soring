package com.xmlConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Product product = new Product();
		Student student = (Student) context.getBean("student");

		System.out.println(student.toString());
		
		Student student2 = (Student) context.getBean("student2");

		System.out.println(student2.toString());

	}

}

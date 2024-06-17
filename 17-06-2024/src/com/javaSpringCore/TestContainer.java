package com.javaSpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		Patient patient = (Patient) context.getBean("patient1");

		System.out.println(patient.toString());

	}

}

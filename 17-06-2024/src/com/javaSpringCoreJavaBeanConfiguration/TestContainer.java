package com.javaSpringCoreJavaBeanConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeansConfiguaration.class);

		Patient patient = (Patient) context.getBean("patient1");

		patient.setPatientId(2);
		patient.setPatientName("Rushikesh");
		patient.setPatientAddress("Nandura");

		System.out.println(patient.toString());

	}

}

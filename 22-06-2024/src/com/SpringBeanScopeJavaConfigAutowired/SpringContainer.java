package com.SpringBeanScopeJavaConfigAutowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContainer {

	public static void main(String[] args) {

		// Spring IoC Container
		ApplicationContext contex = new AnnotationConfigApplicationContext(EmployeeConfig.class);

		// employee object created
		Employee employee = (Employee) contex.getBean("employee");
		
		System.out.println(employee.toString());
		System.out.println(employee.hashCode());
		
		System.out.println();

		Employee employee1 = (Employee) contex.getBean("employee");

		System.out.println(employee1.toString());
		System.out.println(employee1.hashCode());

	}

}

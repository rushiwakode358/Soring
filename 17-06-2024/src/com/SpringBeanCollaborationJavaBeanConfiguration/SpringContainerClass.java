package com.SpringBeanCollaborationJavaBeanConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringContainerClass {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringBeansConfiguaration.class);

		Department department = (Department) context.getBean("department1");
		department.setDepartmentId(4);
		department.setDepartmentName("Development");

		Employee employee = (Employee) context.getBean("employee1");
		employee.setEmployeeId(1);
		employee.setEmployeeName("Rushikesh");
		employee.setEmployeeRole("Web Developer");
		employee.setEmployeeSalary(89890.56);

		employee.setDepartment(department);

		System.out.println(employee.toString());

	}

}

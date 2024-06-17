package com.SpringBeanCollaborationJavaBeanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeansConfiguaration {

	@Bean(name = "employee1")
	public Employee getEmployeeBean() {
		return new Employee();
	}

	@Bean(name = "department1")
	public Department getDepartmentBean() {
		return new Department();
	}

}

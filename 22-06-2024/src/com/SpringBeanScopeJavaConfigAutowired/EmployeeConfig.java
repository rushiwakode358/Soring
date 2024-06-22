package com.SpringBeanScopeJavaConfigAutowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class EmployeeConfig {
	
	@Bean(name="employee")
//	@Scope("prototype")
	@Scope("singleton")
	public Employee getEmployeeBean() {
		return new Employee(1,"Rushi","Web Developer",98987.895);
	}
	
	@Bean(name="department")
    public Department getDepartmentBean() {
        return new Department(101, "Developer");
    }

}

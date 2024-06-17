package com.javaSpringCoreJavaBeanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeansConfiguaration {

	@Bean(name = "patient1")
	public Patient getPatientBean() {
		return new Patient();
	}

}

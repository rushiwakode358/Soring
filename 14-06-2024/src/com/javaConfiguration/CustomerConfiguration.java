package com.javaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {
	
	@Bean(name="customer")
	public Customer getCustomer() {
		return new Customer();
		
	}

}

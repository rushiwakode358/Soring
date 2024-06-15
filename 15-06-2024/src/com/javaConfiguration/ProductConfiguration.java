package com.javaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {

	@Bean(name = "product")
	public Product getProduct() {
		return new Product();

	}

}

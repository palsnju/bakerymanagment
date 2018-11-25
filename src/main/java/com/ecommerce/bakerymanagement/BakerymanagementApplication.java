package com.ecommerce.bakerymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
	
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({ "com.ecommerce.bakerymanagement..*"})
@PropertySources(value = { @PropertySource("classpath:/application.properties") })
public class BakerymanagementApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BakerymanagementApplication	.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BakerymanagementApplication.class, args);
	}
}

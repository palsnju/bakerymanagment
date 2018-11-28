package com.ecommerce.bakerymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
	
@SpringBootApplication
@ComponentScan({"com.ecommerce.bakerymanagement"})
@EnableMongoRepositories({"com.ecommerce.bakerymanagement.mongodb.repository"})
@PropertySources(value = { @PropertySource("classpath:/application.properties") })
@EnableAdminServer
public class BakerymanagementApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BakerymanagementApplication	.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(BakerymanagementApplication.class, args);
	}
}

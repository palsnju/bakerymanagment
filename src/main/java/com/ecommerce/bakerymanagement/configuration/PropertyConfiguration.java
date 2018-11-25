package com.ecommerce.bakerymanagement.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties
@Component	
public class PropertyConfiguration {

}

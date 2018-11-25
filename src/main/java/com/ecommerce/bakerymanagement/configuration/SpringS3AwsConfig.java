package com.ecommerce.bakerymanagement.configuration;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties
@Component
public class SpringS3AwsConfig {

	@Value("${access.key}")
	@NotEmpty
	private String accessKey;

	@Value("${secret.key}")
	@NotEmpty
	private String secretKey;

	@Value("${header.host}")
	@NotEmpty
	private String headerHost;

	@Value("${bucket_name}")
	@NotEmpty
	private String bucketName;

	@Value("${cake_master_folder}")
	@NotEmpty
	private String cakeFolder;

	@Value("${biscuites_master_folder}")
	@NotEmpty
	private String biscuitesFolder;

	@Value("${snacks_master_folder}")
	@NotEmpty
	private String snacksFolder;

	@Value("${s3.endpoint.uri}")
	@NotEmpty
	private String s3Url;
	

	
}

package com.ecommerce.bakerymanagement.configuration;

import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties
@Component
public class SpringS3AwsConfig {

	@Value("${access.key}")
	@NotBlank
	private String accessKey;

	@Value("${secret.key}")
	@NotBlank
	private String secretKey;

	@Value("${header.host}")
	@NotBlank
	private String headerHost;

	@Value("${bucket_name}")
	@NotBlank
	private String bucketName;

	@Value("${cake_master_folder}")
	@NotBlank
	private String cakeFolder;

	@Value("${biscuites_master_folder}")
	@NotBlank
	private String biscuitesFolder;

	@Value("${snacks_master_folder}")
	@NotBlank
	private String snacksFolder;

	@Value("${s3.endpoint.uri}")
	@NotBlank
	private String s3Url;

}

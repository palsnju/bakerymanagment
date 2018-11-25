package com.ecommerce.bakerymanagement.aws.client;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface IS3AwsConfigurationClient {
	
	void s3Uplod(MultipartFile file,Map<String, String> bucketDetails);

	void downloadS3File(Map<String, String> mapDetails);
}

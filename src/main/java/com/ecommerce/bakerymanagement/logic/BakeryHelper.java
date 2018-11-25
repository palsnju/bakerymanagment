package com.ecommerce.bakerymanagement.logic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.ecommerce.bakerymanagement.configuration.SpringS3AwsConfig;

@Component
public class BakeryHelper {

	@Autowired
	private SpringS3AwsConfig springS3AwsConfig;

	public File convertMultiPartToFile(MultipartFile file) throws IOException {
		File convFile = new File(file.getOriginalFilename());
		FileOutputStream fos = new FileOutputStream(convFile);
		fos.write(file.getBytes());
		fos.close();
		return convFile;
	}

	public StringBuilder getS3FileLocation(Map<String, String> bucketDetails) {

		StringBuilder awsFileUploadPathBuilder = new StringBuilder(this.springS3AwsConfig.getBucketName());
		awsFileUploadPathBuilder.append("/");
		awsFileUploadPathBuilder.append(bucketDetails.get("bucketName"));
		return awsFileUploadPathBuilder;
	}

}

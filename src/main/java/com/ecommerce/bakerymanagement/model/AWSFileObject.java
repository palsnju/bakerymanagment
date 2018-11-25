package com.ecommerce.bakerymanagement.model;

import java.io.InputStream;

import org.springframework.stereotype.Component;

import com.amazonaws.services.s3.model.ObjectMetadata;

import lombok.Data;

@Data
@Component
public class AWSFileObject {
	private String bucketName;
	private String file_key;
	private String downloadFilePath;
	private InputStream inputStream;
	private ObjectMetadata fileMetaData;

}

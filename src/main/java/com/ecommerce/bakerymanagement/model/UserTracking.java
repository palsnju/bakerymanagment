package com.ecommerce.bakerymanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import lombok.Data;

@Document(collection="user_tracking")
@Data
@Component
public class UserTracking {

	@Id
	private Long userTrackingId;

	private Long productType;

	private String productName;

	private Long subProductId;

	private String weight;

	private String flavour;

	private Person person;

	private Double price;
	

}

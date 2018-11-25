package com.ecommerce.bakerymanagement.model;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Document(collection="Bakery_manangement.snack_master")
@Data
@Component
public class SnacksMasterDetails {

	@Id
	private Long snackMasterDetailsId;

	private String name;

	private String type;

	private String flavour;

	private Boolean availability;

	private String weight;

	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	private Timestamp createdDate;

	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	private Timestamp lastModifiedDate;

	private Long createdUserId;

	private Long lastModifiedUserId;

}

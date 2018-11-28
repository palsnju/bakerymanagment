package com.ecommerce.bakerymanagement.model;

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mysema.query.annotations.QueryEntity;

import lombok.Data;

@Document(collection="Bakery_manangement.snack_master")
@Data
@QueryEntity
@Component
public class SnacksMasterDetails {

	@Id
	@Field("snack_master_id")
	private String snackMasterDetailsId;

	private String name;

	private String type;

	@Indexed(direction = IndexDirection.ASCENDING)
	private String flavour;

	
	private Boolean availability;

	private String weight;

	@Field("created_date")
	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	@CreatedDate
	@Indexed(direction = IndexDirection.ASCENDING)
	private Timestamp createdDate;

	@Field("last_modified_Date")
	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	@LastModifiedDate
	@Indexed(direction = IndexDirection.ASCENDING)
	private Timestamp lastModifiedDate;

	@Field("created_user_id")
	@CreatedBy
	@NotNull
	private Long createdUserId;

	@Field("last_modified_user_id")
	@LastModifiedBy
	@NotNull
	private Long lastModifiedUserId;


}

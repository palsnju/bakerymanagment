package com.ecommerce.bakerymanagement.model;

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mysema.query.annotations.QueryEntity;

import lombok.Data;


/**
 * It is cakeMasterDetails Bean Class.
 * 
 * @author Danish
 *
 */

@Data
@QueryEntity
@Document(collection="Bakery_manangement.cake_master")	
@Component
public class CakeMasterDetails {

	@Id
	@Field("cake_id")
	private String cakeId;
	
	@NotNull		
	@Field("cake_name")
	private String cakeName;

	@NotNull
	@Field("flavour")
	@Indexed(direction = IndexDirection.ASCENDING)
	private String flavour;

	@NotNull
	private String category;

	@Indexed(direction=IndexDirection.ASCENDING)
	private Double price;

	@NotNull
	private Boolean availability;

	@NotNull
	private String weight;

	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	@Field("created_date")
	@Indexed(direction = IndexDirection.ASCENDING)
	private Timestamp createdDate;

	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	@Field("last_modified_date")
	@Indexed(direction = IndexDirection.ASCENDING)
	private Timestamp lastModifiedDate;


//	@Builder.Default
	@Field("created_user_id")
	@CreatedBy
	private Long createdUserId =1L;

//	@Builder.Default
	@Field("last_modified_user_id")
	@LastModifiedBy
	private Long lastModifiedUserId= 1L;


}

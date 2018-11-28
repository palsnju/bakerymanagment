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

/**
 * It is BiscuitsMasterDetails Bean Class.
 * 
 * @author Danish
 *
 */
@Data
@QueryEntity
@Document(collection = "Bakery_manangement.biscuits_master")
@Component
public class BiscuitsMasterDetails {

	@Id
	@Field("biscuits_Master_id")
	private String biscuitsMasterDetailsId;

	@NotNull
	@Indexed(direction = IndexDirection.ASCENDING)
	private String category;

	@NotNull
	@Indexed(direction = IndexDirection.ASCENDING)
	private String flavour;

	@NotNull
	private Boolean availability;

	@NotNull
	private String weight;

	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	@Field("created_date")
	@CreatedDate
	@Indexed(direction = IndexDirection.ASCENDING)
	private Timestamp createdDate;

	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	@Field("last_modified_date")
	@LastModifiedDate
	@Indexed(direction = IndexDirection.ASCENDING)
	private Timestamp lastModifiedDate;

	@Field("created_user_id")
	@CreatedBy
	private Long createdUserId = 1L;

	@Field("last_modified_user_id")
	@LastModifiedBy
	private Long lastModifiedUserId = 1L;

}

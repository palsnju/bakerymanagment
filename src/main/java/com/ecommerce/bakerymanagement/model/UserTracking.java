package com.ecommerce.bakerymanagement.model;

import java.sql.Timestamp;
import java.util.List;

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

@Document(collection = "user.user_tracking")
@Data
@QueryEntity
@Component
public class UserTracking {

	@Id
	@Field("user_tracking_id")
	private String userTrackingId;

	private List<BiscuitsMasterDetails> biscuitsMasterDetails;

	private List<CakeMasterDetails> cakeMasterDetails;

	private List<SnacksMasterDetails> snacksMasterDetails;

	private Person person;

	@Field("created_date")
	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	@CreatedDate
	@Indexed(direction = IndexDirection.ASCENDING)
	private Timestamp createdDate;

	@Field("last_modified_date")
	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
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

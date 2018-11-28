package com.ecommerce.bakerymanagement.model;

import java.sql.Timestamp;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mysema.query.annotations.QueryEntity;

import lombok.Data;

/**
 * It is PersonCommunication Bean Class.
 * 
 * @author Danish
 *
 */
@Document(collection = "user.person_communication")
@JsonIgnoreProperties
@Data
@QueryEntity
@Component
public class PersonCommunication {

	@Id
	@Field("person_communication_id")
	private String personCommunicationId;

	@Field("communication_type")
	@Indexed(direction = IndexDirection.ASCENDING)
	private long communicationType;
	@Field("sub_type")
	private long subType;
	@Field("communication_value")
	@Indexed(direction = IndexDirection.ASCENDING)
	private String communicationValue;
	private boolean active;

	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	@Field("created_date")

	private Timestamp createdDate;
	@CreatedBy
	@Field("created_user_id")
	private long createdUserId;
	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	@Field("last_modified_date")
	private Timestamp lastModifiedDate;
	@Field("last_modified_user_id")
	@LastModifiedBy
	private long lastModifiedUserId;

}
package com.ecommerce.bakerymanagement.model;

import java.sql.Timestamp;
import java.util.List;

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
 * It is Person Bean Class.
 * 
 * @author Danish
 *
 */

@Document(collection = "user.person")
@JsonIgnoreProperties
@Data
@QueryEntity
@Component
public class Person {

	@Id
	@Field("person_id")
	private String personId;
	@Field("last_name")
	@Indexed(direction = IndexDirection.ASCENDING)
	private String lastName;
	@Field("first_name")
	@Indexed(direction = IndexDirection.ASCENDING)
	private String firstName;
	@Field("created_date")
	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	private Timestamp createdDate;
	@CreatedBy
	@Field("created_user_id")
	long createdUserId;
	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	@Field("last_modified_date")
	private Timestamp lastModifiedDate;
	@Field("last_modified_user_id")
	@LastModifiedBy
	private long lastModifiedUserId;
	private List<PersonCommunication> personCommunications;

}
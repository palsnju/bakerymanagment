package com.ecommerce.bakerymanagement.model;

import java.sql.Timestamp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@Component
public class PersonCommunication {

	@Id
	private long personCommunicationId;
	private long communicationType;
	private long subType;
	private String communicationValue;
	private boolean active;
	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	Timestamp createdDate;
	private long createdUserId;
	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	Timestamp lastModifiedDate;
	private long lastModifiedUserId;

}
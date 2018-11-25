package com.ecommerce.bakerymanagement.model;

import java.sql.Timestamp;

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
@JsonIgnoreProperties
@Data
@Component
public class PersonCommunication {
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
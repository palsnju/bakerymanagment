package com.ecommerce.bakerymanagement.model;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@Component
public class Person {

	@Id
	private long personId;
	private String lastName;
	private String firstName;
	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	private Timestamp createdDate;
	long createdUserId;
	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	private Timestamp lastModifiedDate;
	private long lastModifiedUserId;
	private List<PersonCommunication> personCommunications;

}
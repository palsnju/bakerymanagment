package com.ecommerce.bakerymanagement.model;

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;


/**
 * It is cakeMasterDetails Bean Class.
 * 
 * @author Danish
 *
 */

@Document(collection="Bakery_manangement.cake_master")
@Data
@Component
public class CakeMasterDetails {

	@Id
	private Long cakeId;
	
	@NotNull		
	private String cakeName;

	@NotNull
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
	private Timestamp createdDate;

	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	private Timestamp lastModifiedDate;


//	@Builder.Default
	private Long createdUserId =1L;

//	@Builder.Default
	private Long lastModifiedUserId= 1L;

}

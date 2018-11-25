package com.ecommerce.bakerymanagement.model;

import java.sql.Timestamp;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
import lombok.Data;

@Document(collection="Bakery_manangement.biscuits_master")
@Data
@Component
@Builder
public class BiscuitsMasterDetails {

	@Id
	private Long biscuitsMasterDetailsId;

	@NotNull
	private String category;

	@NotNull
	private String flavour;

	@NotNull
	private Boolean availability;

	@NotNull
	private String weight;

	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	private Timestamp createdDate;

	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	private Timestamp lastModifiedDate;

	@Builder.Default
	private Long createdUserId =1L;

	@Builder.Default
	private Long lastModifiedUserId =1L;

}

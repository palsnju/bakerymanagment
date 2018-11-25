package com.ecommerce.bakerymanagement.model;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Document(collection = "user.user_tracking")
@Data
@Component
public class UserTracking {

	@Id
	private Long userTrackingId;

	private List<BiscuitsMasterDetails> biscuitsMasterDetails;

	private List<CakeMasterDetails> cakeMasterDetails;

	private List<SnacksMasterDetails> snacksMasterDetails;

	private Person person;

	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	private Timestamp createdDate;

	@JsonFormat(pattern = "MMM dd, yyyy hh:mm:ss aa")
	private Timestamp lastModifiedDate;

	// @Builder.Default
	private Long createdUserId = 1L;

	// @Builder.Default
	private Long lastModifiedUserId = 1L;

}

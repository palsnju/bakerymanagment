package com.ecommerce.bakerymanagement.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.bakerymanagement.biz.client.IBakeryManagementMasterClient;
import com.ecommerce.bakerymanagement.constants.WebConstants;
import com.ecommerce.bakerymanagement.model.CakeMasterDetails;
import com.ecommerce.bakerymanagement.model.UserTracking;

@RestController
@Component
public class UserConfigurationController {
	
	@Autowired
	private IBakeryManagementMasterClient  iBakeryManagementMasterClient;

	@PostMapping(name = WebConstants.ORDER_DETAILS, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveOrderDetails(@RequestBody UserTracking userTracking, HttpServletResponse httpServletResponse) {

		try {

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	@PostMapping(name = WebConstants.CAKE_MASTER_DETAILS, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveOrderDetails(@RequestBody CakeMasterDetails cakeMasterDetails, HttpServletResponse httpServletResponse) {

		try {

			iBakeryManagementMasterClient.saveCakeMasterDetails(cakeMasterDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

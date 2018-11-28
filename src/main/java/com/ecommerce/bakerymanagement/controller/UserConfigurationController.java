package com.ecommerce.bakerymanagement.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.bakerymanagement.biz.client.IBakeryManagementMasterClient;
import com.ecommerce.bakerymanagement.biz.client.IBakeryOrderConfigurationClient;
import com.ecommerce.bakerymanagement.constants.WebConstants;
import com.ecommerce.bakerymanagement.model.CakeMasterDetails;
import com.ecommerce.bakerymanagement.model.UserTracking;

@RestController
@RequestMapping(value = "/v1")
public class UserConfigurationController {

	@Autowired
	private IBakeryManagementMasterClient iBakeryManagementMasterClient;

	private IBakeryOrderConfigurationClient iBakeryOrderConfigurationClient;

	@PostMapping(value = WebConstants.ORDER_DETAILS, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveOrderDetails(@RequestBody UserTracking userTracking, HttpServletResponse httpServletResponse) {
		try {
			iBakeryOrderConfigurationClient.saveOrderDetails(userTracking);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PostMapping(value = WebConstants.CAKE_MASTER_DETAILS, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveOrderDetails(@RequestBody CakeMasterDetails cakeMasterDetails,
			HttpServletResponse httpServletResponse) {

		try {

			iBakeryManagementMasterClient.saveCakeMasterDetails(cakeMasterDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@GetMapping(value = WebConstants.CAKE_MASTER_DETAILS, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<CakeMasterDetails> getCakeDetails(HttpServletResponse httpServletResponse) {

		try {

			return iBakeryManagementMasterClient.getCakeList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}

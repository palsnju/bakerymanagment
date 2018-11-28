package com.ecommerce.bakerymanagement.biz.client.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ecommerce.bakerymanagement.biz.client.IBakeryManagementMasterClient;
import com.ecommerce.bakerymanagement.exceptions.BakeryConfigurationException;
import com.ecommerce.bakerymanagement.model.CakeMasterDetails;
import com.ecommerce.bakerymanagement.mongodb.repository.CakeRepository;

@Component
public class BakeryManagementClientImpl implements IBakeryManagementMasterClient {

	@Autowired
	private CakeRepository cakeRepositry;

	@Override
	public void saveCakeMasterDetails(CakeMasterDetails cakeMasterDetails) throws BakeryConfigurationException {
		
		try {
			cakeRepositry.save(cakeMasterDetails);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<CakeMasterDetails> getCakeList() throws BakeryConfigurationException {
		
		try {
			return cakeRepositry.findAll();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}

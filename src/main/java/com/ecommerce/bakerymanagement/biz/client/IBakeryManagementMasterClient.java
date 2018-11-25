package com.ecommerce.bakerymanagement.biz.client;

import com.ecommerce.bakerymanagement.exceptions.BakeryConfigurationException;
import com.ecommerce.bakerymanagement.model.CakeMasterDetails;

public interface IBakeryManagementMasterClient {
	
	
	void saveCakeMasterDetails(CakeMasterDetails cakeMasterDetails) throws BakeryConfigurationException;

}

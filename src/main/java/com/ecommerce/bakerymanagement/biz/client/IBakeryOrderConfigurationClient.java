package com.ecommerce.bakerymanagement.biz.client;

import com.ecommerce.bakerymanagement.model.UserTracking;

public interface IBakeryOrderConfigurationClient {

	void saveOrderDetails(UserTracking userTracking);
}

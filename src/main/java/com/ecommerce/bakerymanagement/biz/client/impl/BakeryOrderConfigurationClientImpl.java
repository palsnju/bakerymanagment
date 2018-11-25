package com.ecommerce.bakerymanagement.biz.client.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ecommerce.bakerymanagement.biz.client.IBakeryOrderConfigurationClient;
import com.ecommerce.bakerymanagement.model.UserTracking;
import com.ecommerce.bakerymanagement.mongodb.repository.OrderRepository;

@Component
public class BakeryOrderConfigurationClientImpl implements IBakeryOrderConfigurationClient {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void saveOrderDetails(UserTracking userTracking) {
		orderRepository.save(userTracking);
	}

}

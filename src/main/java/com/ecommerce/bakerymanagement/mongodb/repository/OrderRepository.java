package com.ecommerce.bakerymanagement.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ecommerce.bakerymanagement.model.UserTracking;

public interface OrderRepository extends MongoRepository<UserTracking, Long> {

}

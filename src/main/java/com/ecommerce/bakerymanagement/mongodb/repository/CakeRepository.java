package com.ecommerce.bakerymanagement.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.bakerymanagement.model.CakeMasterDetails;

@Repository
public interface CakeRepository extends MongoRepository<CakeMasterDetails, Long> {

	
}

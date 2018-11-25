package com.ecommerce.bakerymanagement;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

public class MongoDbConnectivity {
	
	public static void main(String[] args) {
		
		MongoClient  mongoClient=new MongoClient("localhost	",27017);
		System.out.println("server connection successfully done");
		MongoDatabase  mongoDatabase=mongoClient.getDatabase("test");
		System.out.println("server connection successfully created");
		System.out.println("database name "+mongoDatabase.getName());
	}

}

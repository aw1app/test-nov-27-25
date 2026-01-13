package com.sl;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class AppWithSchemaValidation {
	private static MongoClient mongoClient;
	private static MongoDatabase database;
	private static MongoCollection<Document> productsCollection;

	public static void main(String[] args) {
		connectToMongoDB();

		// schema
		Document schemaDoc = new Document("bsonType", "object")
				.append("properties",
				new Document("price", new Document("bsonType", "double").append("minimum", 100000)
						.append("description", "price must be a GT 100000 number")));
						
		Document priceValidation = new Document("$jsonSchema",schemaDoc);
		
		Document command = new Document("collMod", "products")
                .append("validator", priceValidation)
                .append("validationLevel", "moderate")
                .append("validationAction", "error");
		
		// enforce schema command
		database.runCommand(command);
		
		System.out.println("Price field validation added successfully");
		
		//Task-3 Try adding with GT 100000 - Pass
		
		
		//Task-4 Try adding with price LT 100000-  Fail
	}

	private static void connectToMongoDB() {
		// Connect to local MongoDB
		String localDBURL = "mongodb://localhost:27017";

		mongoClient = MongoClients.create(localDBURL);
		database = mongoClient.getDatabase("cis_estore");

		productsCollection = database.getCollection("products");

		System.out.println("Successfully connected to products collection of cis_estore database");
	}

	private static void listProducts() {
		System.out.println("\nAll Products:");
		productsCollection.find().forEach(doc -> System.out.println(doc.toJson()));
	}

}

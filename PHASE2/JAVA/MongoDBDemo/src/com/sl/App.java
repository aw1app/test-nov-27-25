package com.sl;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class App {
	private static MongoClient mongoClient;
	private static MongoDatabase database;
	private static MongoCollection<Document> productsCollection;

	// Disable MongoDB driver logging

	public static void main(String[] args) {
		Logger.getLogger("org.mongodb.driver").setLevel(Level.SEVERE);

		connectToMongoDB();

		listProducts();

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
		
		productsCollection.find().forEach( doc -> System.out.println(doc.toJson()));

	}
}

package com.sl;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class App {
	private static MongoClient mongoClient;
	private static MongoDatabase database;
	private static MongoCollection<Document> productsCollection;

	// Disable MongoDB driver logging

	public static void main(String[] args) {
		Logger.getLogger("org.mongodb.driver").setLevel(Level.SEVERE);

		connectToMongoDB();

		listProducts();

//		Document newProductDoc = new Document()
//				.append("id" , 3)
//				.append("name" , "Dell AI PC 3")
//				.append("price" , 77800.99f);
//
//		insertProduct(newProductDoc);

		// Insert many docs
		Document newProductDoc1 = new Document()
				.append("id", 4)
				.append("name", "Dell AI PC 4")
				.append("price",
				77800.4f);

		Document newProductDoc2 = new Document().append("id", 5).append("name", "Dell AI PC 5").append("price",
				57800.5f);
		
		List<Document> newProductDocs = List.of(newProductDoc1,newProductDoc2 );
		insertProducts(newProductDocs);
		
		//MONGO-TASK-1: Write code insert 3 products. The 3rd product should have vendor details as well.

	}

	private static void insertProduct(Document newProductDoc) {
		productsCollection.insertOne(newProductDoc);
	}

	private static void insertProducts(List<Document> newProductDocs) {
		productsCollection.insertMany(newProductDocs);
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

		// Find documents having specific criteria.
		System.out.println("\nAll Products with price GTE 50000 :");
		Bson priceGTE50000 = Filters.gte("price", 50000.0f);
		productsCollection.find(priceGTE50000).forEach(doc -> System.out.println(doc.toJson()));
	}
}

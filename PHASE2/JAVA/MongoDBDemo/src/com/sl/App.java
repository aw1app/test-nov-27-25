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
import com.mongodb.client.model.Updates;
import com.mongodb.client.model.Updates;

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
//		Document newProductDoc1 = new Document()
//				.append("id", 4)
//				.append("name", "Dell AI PC 4")
//				.append("price",
//				77800.4f);
//
//		Document newProductDoc2 = new Document().append("id", 5).append("name", "Dell AI PC 5").append("price",
//				57800.5f);
//		
//		List<Document> newProductDocs = List.of(newProductDoc1,newProductDoc2 );
//		insertProducts(newProductDocs);
//		
		//MONGO-TASK-1: Write code insert 3 products. The 3rd product should have vendor details as well.
		
//		Document vendor2 = new Document().append("name", "Samsung").append("countryOforigin", "India");
//		
//		Document newProductDoc10 = new Document()
//				.append("id", 10)
//				.append("name", "Dell AI PC 10")
//				.append("price",77800.4f)
//				.append("vendor", vendor2);
//		insertProduct(newProductDoc10);
		
		// Demo update
		updateProduct(3, 100000.0f); // update prod doc that has id=3 with price 100000.0f
		
		// update many product to price 99999 where current price is >= 50000
		updateProducts(50000,99999.99f);
		
		System.out.println("END");
	}

	// update product given id feild value setting it's new price
	private static void updateProduct(int id, float newPrice) {
		Bson idFilter = Filters.eq("id", id);
		Bson update = Updates.set("price",newPrice);
		
		productsCollection.updateOne(idFilter,update );
		System.out.println("Successfully updated price");
	}
	
	// update products given price GTE  setting it's new price
		private static void updateProducts(float price, float newPrice) {
			Bson idFilter = Filters.gte("price", price);
			Bson update = Updates.set("price",newPrice);
			
			productsCollection.updateMany(idFilter,update );
			System.out.println("Successfully updated price for many docs");
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

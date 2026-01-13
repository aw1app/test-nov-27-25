package com.sl;

public class App {

	// Disable MongoDB driver logging
	Logger.getLogger("org.mongodb.driver").setLevel(Level.SEVERE);

	public static void main(String[] args) {
		
		connectToMongoDB();

	}

	private static void connectToMongoDB() {
		// Connect to local MongoDB
		String localDBURL ="mongodb://localhost:27017";
		
		 MongoClients.create(cloudAtlasURL);
		
	}

}

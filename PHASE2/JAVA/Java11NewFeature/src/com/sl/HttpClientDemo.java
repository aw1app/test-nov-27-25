package com.sl;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo {

	public static void main(String[] args) throws IOException, InterruptedException {

		// 1.
		HttpClient client = HttpClient.newHttpClient();

		// 2. create the http request
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
				.GET()
				.build();
		
		// 3. Send the request and get the response
		HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());
		
		// 4. print the response
		System.out.println("Status Code: " + response.statusCode());
        System.out.println("Response Body:");
        System.out.println(response.body());
        
        
        // Task-1: Fetch the mobile page https://www.amazon.in/Samsung-Storage-MediaTek-Charging-Upgrades/dp/B0FN7QTRPY

	}

}

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
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
				.GET().build();

		// 3. Send the request and get the response
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		// 4. print the response
		System.out.println("Status Code: " + response.statusCode());
		System.out.println("Response Body:");
		System.out.println(response.body());

		// Task-1: Fetch the mobile page
		// https://www.amazon.in/Samsung-Storage-MediaTek-Charging-Upgrades/dp/B0FN7QTRPY

		// SOLUTION:
		System.out.println("\n Amazon Product Page \n");

		HttpRequest amazonRequest = HttpRequest.newBuilder()
				.uri(URI.create("https://www.amazon.in/Samsung-Storage-MediaTek-Charging-Upgrades/dp/B0FN7QTRPY"))
				.header("User-Agent",
						"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36")
				.header("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8")
				.header("Accept-Language", "en-US,en;q=0.9")
				.GET()
				.build();

		HttpResponse<String> amazonResponse = client.send(amazonRequest, HttpResponse.BodyHandlers.ofString());

		System.out.println("Status code: " + amazonResponse.statusCode());
		System.out.println("Response body:");
		System.out.println(amazonResponse.body());

		// DEMO POST
	}

}

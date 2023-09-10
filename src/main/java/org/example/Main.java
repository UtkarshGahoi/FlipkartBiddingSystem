package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            // Specify the URL of the API you want to request
            String apiUrl = "https://jsonplaceholder.typicode.com/posts";

            // Create a URL object with the API URL
            URL url = new URL(apiUrl);

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method (GET, POST, etc.)
            connection.setRequestMethod("GET");

            // Set request headers (if needed)
            connection.setRequestProperty("User-Agent", "Java HTTP Client");

            // Get the response code
            int responseCode = connection.getResponseCode();

            // Check if the response code indicates success (usually 200)
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Read the response data
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // Print the response data
                System.out.println("Response Data:");
                System.out.println(response.toString());
//                System.out.println(response.get("")
                  for(int i=0;i<response.length();i++){
                  }
            } else {
                System.out.println("HTTP Request Failed with response code: " + responseCode);
            }

            // Close the connection
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }



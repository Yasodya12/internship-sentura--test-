package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Main {
    private static final String API_BASE_URL = "https://your-weavy-cloud-domain.com/api/";

    private final OkHttpClient httpClient = new OkHttpClient();

    public String fetchDataFromWeavy(String endpoint) throws Exception {
        Request request = new Request.Builder()
                .url(API_BASE_URL + endpoint)
                .addHeader("Authorization", "Bearer your-api-token")
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new RuntimeException("Failed to fetch data from Weavy: " + response);
            }
            return response.body().string();
        }
    }

    public static void main(String[] args) {
        Main client = new Main();
        try {
            String responseData = client.fetchDataFromWeavy("endpoint-path");
            System.out.println("Response from Weavy: " + responseData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

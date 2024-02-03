package org.example.service;


import okhttp3.Request;
import okhttp3.Response;

@Service
public class Service {
    public String fetchDataFromApi(String apiUrl) throws Exception {
//        Request request = new Request.Builder()
//                .url("https://30b9551639d047949c1bcc6ea8bfdad8.weavy.io")
//                .build();
//
//        try (Response response = httpClient.newCall(request).execute()) {
//            if (!response.isSuccessful()) {
//                throw new RuntimeException("Failed to fetch data: " + response);
//            }
//            return response.body().string();
//
//
//
//        }

        try {
            Request request = new Request.Builder()
                    .url(weavyEndpointUrl)
                    .addHeader("Authorization", "Bearer your-api-token")
                    .build();

            try (Response response = httpClient.newCall(request).execute()) {
                if (!response.isSuccessful()) {
                    throw new RuntimeException("Failed to fetch data from Weavy: " + response);
                }
                return response.body().string();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error occurred while calling Weavy endpoint: " + e.getMessage();
        }
    }
}

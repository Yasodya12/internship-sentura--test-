package org.example.service;


@Service
public class Service {
    public String fetchDataFromApi(String apiUrl) throws Exception {
        Request request = new Request.Builder()
                .url("https://30b9551639d047949c1bcc6ea8bfdad8.weavy.io")
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new RuntimeException("Failed to fetch data: " + response);
            }
            return response.body().string();
        }
    }
}

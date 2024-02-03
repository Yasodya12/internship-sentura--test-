package org.example.controller;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.example.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {


    @Autowired
    Service service;
    private static final String WEAVY_API_BASE_URL = "https://your-weavy-cloud-domain.com/api/";
    private final OkHttpClient httpClient = new OkHttpClient();

    @GetMapping("/weavy/{endpoint}")
    public String callWeavyEndpoint(@PathVariable String endpoint) {
        String weavyEndpointUrl = WEAVY_API_BASE_URL + endpoint;

        service.fetchDataFromApi(weavyEndpointUrl);


    }
}

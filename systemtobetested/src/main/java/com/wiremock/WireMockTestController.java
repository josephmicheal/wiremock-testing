package com.wiremock;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WireMockTestController {

    @Autowired
    RestTemplate restTemplate;

    @Value("${system1.host_value}")
    private String system1Host;


    @GetMapping("/")
    public Product index(@RequestParam(required = false) String product_id) {
        System.out.println("product_id: " + product_id);
        if ("1".equals(product_id))
            return restTemplate.getForObject(
                    "http://" + system1Host + "/api/product?product_id=" + product_id, Product.class);
        else return restTemplate.getForObject(
                "http://" + system1Host + "/api/product", Product.class);
    }

    @GetMapping("/large-size-service-response")
    public String largeSizeResponse() {
        return restTemplate.getForObject(
                "http://" + system1Host + "/api/large-file", String.class);
    }

    @GetMapping("/slow-service-response")
    public String slowServiceResponse() {
        return restTemplate.getForObject(
                "http://" + system1Host + "/api/payment/history", String.class);
    }
}
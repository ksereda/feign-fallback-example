package com.example.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-two", url = "http://localhost:8082/", fallback = Fallback.class)
public interface ServiceTwoFeignClient {

    @GetMapping("/getStringFromServiceTwo")
    String getString();

}

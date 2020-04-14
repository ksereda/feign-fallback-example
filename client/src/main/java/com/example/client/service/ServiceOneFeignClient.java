package com.example.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "service-one", url = "http://localhost:8081/")
public interface ServiceOneFeignClient {

    @GetMapping("/getStringFromServiceOne")
    String getString();

}

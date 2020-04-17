package com.example.client.service;

//import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "service-three",
        url = "http://localhost:8083/"
)
public interface ServiceThreeFeignClient {

    @GetMapping("/getStringFromServiceThree")
    String getString();

}

package com.example.client.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fallback implements ServiceTwoFeignClient {

    @Autowired
    private ServiceThreeFeignClient serviceThreeFeignClient;

    @Override
    public String getString() {
        System.out.println("Called MOVIE-SERVICE with Fallback class!");
        return serviceThreeFeignClient.getString();
    }

}

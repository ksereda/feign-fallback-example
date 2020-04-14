package com.example.client.service;

import org.springframework.stereotype.Component;

@Component
public class Fallback implements ServiceTwoFeignClient {
    @Override
    public String getString() {
        System.out.println("Called MOVIE-SERVICE with Fallback class!");
        return new String("FALLBACK STRING");
    }

}

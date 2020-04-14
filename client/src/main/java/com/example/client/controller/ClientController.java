package com.example.client.controller;

import java.util.logging.Logger;

import com.example.client.service.ServiceOneFeignClient;
import com.example.client.service.ServiceTwoFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ClientController {

   Logger logger = Logger.getLogger(ClientController.class.getName());

    @Autowired
    private ServiceOneFeignClient serviceOneFeignClient;

    @Autowired
    private ServiceTwoFeignClient serviceTwoFeignClient;

    @RequestMapping(path = "/getDataFromServiceOneByFeign")
    public String getDataFromServiceOne() {
        String result = serviceOneFeignClient.getString();
        logger.info("Calling through Feign Client");
        return result;
    }

    @RequestMapping(path = "/getDataFromServiceTwoByFeign")
    public String getDataFromServiceTwo() {
        String result = serviceTwoFeignClient.getString();
        logger.info("Calling through Feign Client");
        return result;
    }

}

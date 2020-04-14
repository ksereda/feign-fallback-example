package com.example.servicethree.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ThreeController {

    Logger logger = Logger.getLogger(ThreeController.class.getName());

    @GetMapping("/getStringFromServiceThree")
    public String getString() {
        logger.info("Get String from SERVICE-THREE");
        return "Get String from SERVICE-THREE";
    }

}

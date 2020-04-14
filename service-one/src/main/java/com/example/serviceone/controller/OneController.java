package com.example.serviceone.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class OneController {

    Logger logger = Logger.getLogger(OneController.class.getName());

    @GetMapping("/getStringFromServiceOne")
    public String getString() {
        logger.info("Get String from SERVICE-ONE");
        return "Get String from SERVICE-ONE";
    }

}

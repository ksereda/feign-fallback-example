package com.example.servicetwo.controller;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TwoController {

    Logger logger = Logger.getLogger(TwoController.class.getName());

    @GetMapping("/getStringFromServiceTwo")
    public String getString() {
        logger.info("Get String from SERVICE-TWO");
        return "Get String from SERVICE-TWO";
    }

}

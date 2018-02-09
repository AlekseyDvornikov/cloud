package com.cloud.cloud.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }


}

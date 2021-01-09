package com.example.simplewebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleWebAppController {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/boot")
    public String testBoot() {
        return "Hello World Boot Test";
    }
}

package com.tekone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TekoneController {

    @RequestMapping("/hello")
    public String helloWorld() {

        return "Hello World By Tekone";

    }
}

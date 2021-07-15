package com.practise.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting (Map<String, Object> model) {
        model.put("message", "Hello Sumit");
        // returns a jsp page with name greeting, jsp is suffixed from application.properties
        return "greeting";
    }

    @GetMapping("thyme")
    public String greetingThyme (Map<String, Object> model) {
        model.put("message", "Hello Thymeleaf from Sumit");
        // returns a jsp page with name greeting, jsp is suffixed from application.properties
        return "thyme";
    }
}

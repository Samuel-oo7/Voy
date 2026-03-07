package com.voy.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
public class HomeController {

    @GetMapping("/")
    public Map<String, String> welcome() {
        return Map.of(
                "status", "Online",
                "message", "Welcome to the Voy API!",
                "version", "v0.0.1-SNAPSHOT"
        );
    }
}
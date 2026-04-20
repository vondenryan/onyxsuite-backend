package com.onyxsuite.onyxcore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoreController {
    @GetMapping("/test")
    public String test() {
        return "Spring Boot Inicializado!";
    }
}

package com.example.PigeonsVoyageurs.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestingController {
    @GetMapping("/test")
    public String greeting(){
        return "hello, world!";
    }
}

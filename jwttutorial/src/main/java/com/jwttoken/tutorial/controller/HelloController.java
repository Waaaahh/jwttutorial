package com.jwttoken.tutorial.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api")
@Log4j2
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        log.info("hello requested");
        return ResponseEntity.ok("hello");
    }

}

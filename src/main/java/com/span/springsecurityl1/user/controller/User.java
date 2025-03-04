package com.span.springsecurityl1.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

    @GetMapping("hello")
    ResponseEntity<String> hello(){
        return ResponseEntity.ok("Hello World");
    }

}

package com.example.demo.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/test")
    ResponseEntity<String> testFunction(){
        return ResponseEntity.ok().body("Hello from Nisarg again again");
        
    }


}

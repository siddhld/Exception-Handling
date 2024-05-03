package com.exception.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.exception.service.MessageService;

@RestController
public class MessageController {
    
    @Autowired
    private MessageService service;

    @GetMapping("/fetch")
    public ResponseEntity<?> fetch(){
        return ResponseEntity.ok().body(service.fetch());
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody String message){
        return ResponseEntity.ok().body(service.save(message));
    }

}

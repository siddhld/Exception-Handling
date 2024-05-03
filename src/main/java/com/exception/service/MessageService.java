package com.exception.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exception.dao.MessageRepository;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public String fetch() {
        return repository.get();
    }

    public String save(String message) {
        return repository.save(message);
    }
    
}

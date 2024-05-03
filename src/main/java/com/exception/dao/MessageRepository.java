package com.exception.dao;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.exception.customException.MessageAlreadyExistException;
import com.exception.customException.MessageNotFoundException;

import lombok.Data;

@Data
@Repository
public class MessageRepository {
    
    List<String> messages = new ArrayList<>();
    
    public String get() {
        if(messages.size() <= 0)
            throw new MessageNotFoundException("No Message Found");
            System.out.println(messages.get(0));
        return messages.get(0);
    }

    public String save(String message){
        if(messages.contains(message)){
            throw new MessageAlreadyExistException("Message already present");
        }
        messages.add(message);
        return "Message saved Successfully";
    }

}

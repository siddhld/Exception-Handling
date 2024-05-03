package com.exception.customException;

public class MessageAlreadyExistException extends RuntimeException {
    public MessageAlreadyExistException(String message) {
        super(message);
    }
}

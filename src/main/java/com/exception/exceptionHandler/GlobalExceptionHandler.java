package com.exception.exceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.exception.customException.MessageAlreadyExistException;
import com.exception.customException.MessageNotFoundException;

/* 
 * This class is like a special helper for your application.
 * Its job is to catch errors (exceptions) that might happen during message saving or fetching.
 * It's connected to all controllers (message endpoints) in your application.
 */ 
@RestControllerAdvice
public class GlobalExceptionHandler extends RuntimeException {
    

    /*
     * Imagine someone tries to save a message that already exists.
     * This method catches that specific error (MessageAlreadyExistException).
     * 
     * It then creates a response to send back like a messenger.
     * The response says there's a conflict (like trying to add the same song twice to a playlist).
     * It also includes the exact error message for reference.
     */
    @ExceptionHandler(MessageAlreadyExistException.class)
    public ResponseEntity<?> handleException(MessageAlreadyExistException ex){
        return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body(ex.getMessage());
    }


    // This method is similar to the one above, but for a different error.
    @ExceptionHandler(MessageNotFoundException.class)
    public ResponseEntity<?> handleException(MessageNotFoundException ex){
        return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(ex.getMessage());
    }

}

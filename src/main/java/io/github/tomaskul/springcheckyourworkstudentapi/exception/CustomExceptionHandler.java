package io.github.tomaskul.springcheckyourworkstudentapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(RelevantException.class)
    public ResponseEntity<Void> handleRelevantException(RelevantException ex){
        System.out.println("a super relevant exception has been thrown!");
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

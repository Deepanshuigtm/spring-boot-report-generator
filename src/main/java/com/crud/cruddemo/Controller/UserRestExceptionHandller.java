package com.crud.cruddemo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class UserRestExceptionHandller {

    @ExceptionHandler
    public ResponseEntity<UserErrorResponse> handleException (UserNotFoundException exc){

        UserErrorResponse err = new UserErrorResponse();
        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setMessage(exc.getMessage());
        err.setTimeStamep(System.currentTimeMillis());

        return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<UserErrorResponse> handleException (Exception exc){

        UserErrorResponse err = new UserErrorResponse();
        err.setStatus(HttpStatus.BAD_REQUEST.value());
        err.setMessage(exc.getMessage());
        err.setTimeStamep(System.currentTimeMillis());

        return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
    }
}

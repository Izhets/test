package ru.redcollar.test.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.LOCKED)
public class BadRequestException extends RuntimeException{

    public BadRequestException(String message){
        super(message);
    }

}

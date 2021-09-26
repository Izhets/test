package ru.redcollar.test.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.LOCKED)
public class LockedAgeException extends Exception{

    public LockedAgeException(String message){
        super(message);
    }

}

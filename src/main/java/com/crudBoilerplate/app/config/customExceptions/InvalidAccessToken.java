package com.crudBoilerplate.app.config.customExceptions;

public class InvalidAccessToken extends RuntimeException{
    public InvalidAccessToken(String message){
        super(message);
    }
}

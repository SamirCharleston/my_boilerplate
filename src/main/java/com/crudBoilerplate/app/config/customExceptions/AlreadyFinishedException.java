package com.crudBoilerplate.app.config.customExceptions;

public class AlreadyFinishedException extends RuntimeException {
    public AlreadyFinishedException(String message){
        super(message);
    }
}

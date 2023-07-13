package com.example.HWOnlineStore.exceptions;

public class EmptyClientsListException extends RuntimeException {

    public EmptyClientsListException(String message){
        super(message);
    }
}

package com.busyqa.ExceptionsDemo;

public class AgeRestrictionException extends RuntimeException{

    AgeRestrictionException(String message){
        super(message);
    }
}

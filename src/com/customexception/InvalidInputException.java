package com.customexception;

public class InvalidInputException extends RuntimeException {
    public InvalidInputException(String msg){
        System.out.println(msg);
    }
}

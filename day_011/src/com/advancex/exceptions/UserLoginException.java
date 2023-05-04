package com.advancex.exceptions;

public class UserLoginException extends Exception /*RuntimeException*/ {
    public UserLoginException() {
    }

    public UserLoginException(String message) {
        super(message);
    }
}

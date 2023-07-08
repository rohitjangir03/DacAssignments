package com.app.exception;

@SuppressWarnings("serial")
public class customException extends RuntimeException{
    public customException(String mesg) {
    	super(mesg);
    }
}

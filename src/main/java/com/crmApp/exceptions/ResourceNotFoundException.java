package com.crmApp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ResourceNotFoundException extends Exception{
    private String errorMsg;

    public ResourceNotFoundException(String msg){
        super(msg);
        this.errorMsg = msg;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}

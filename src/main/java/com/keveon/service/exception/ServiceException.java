package com.keveon.service.exception;

import org.springframework.http.HttpStatus;

public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = -1395256366325498861L;

    public HttpStatus status;

    public ServiceException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}

package com.keveon.factory.service.exception;

import org.springframework.http.HttpStatus;

/**
 * The type Service exception.
 */
public class ServiceException extends RuntimeException {
    private static final long serialVersionUID = -1395256366325498861L;

    /**
     * The Status.
     */
    public HttpStatus status;

    /**
     * Instantiates a new Service exception.
     *
     * @param message the message
     * @param status  the status
     */
    public ServiceException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}

package com.keveon.exception;

public class PageNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -1395256366325498861L;

    public PageNotFoundException(String message) {
        super(message);
    }
}

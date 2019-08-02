package com.keveon.factory.exception;

/**
 * The type Page not found exception.
 */
public class PageNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -1395256366325498861L;

    /**
     * Instantiates a new Page not found exception.
     *
     * @param message the message
     */
    public PageNotFoundException(String message) {
        super(message);
    }
}

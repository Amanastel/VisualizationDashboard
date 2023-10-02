package com.blackcoffer.Exception;

public class DataEntityException extends RuntimeException{

    private static final long serialVersionUID = 1L;
    private String message;
    private String description;

    public DataEntityException(String message, String description) {
        this.message = message;
        this.description = description;
    }

    public DataEntityException(String message, String description, Throwable cause) {
        super(cause);
        this.message = message;
        this.description = description;
    }

    public DataEntityException(String message, String description, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(cause);
        this.message = message;
        this.description = description;
    }

    public DataEntityException() {
    }

    public DataEntityException(Throwable cause) {
        super(cause);
    }

    public DataEntityException(String message) {
        super(message);
    }

    public DataEntityException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataEntityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause);
    }
}

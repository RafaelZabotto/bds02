package com.devsuperior.bds02.services.exceptions;

public class DatabaseException extends RuntimeException{
    private static final long serialVersionUID = 5573572785382419086L;

    public DatabaseException(String msg) {
        super(msg);
    }
}

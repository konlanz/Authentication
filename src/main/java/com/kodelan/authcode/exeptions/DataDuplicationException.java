package com.kodelan.authcode.exeptions;

public class DataDuplicationException extends RuntimeException {
    public DataDuplicationException(String message) {
        super(message);
    }
}
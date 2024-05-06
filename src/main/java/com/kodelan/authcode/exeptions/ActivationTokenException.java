package com.kodelan.authcode.exeptions;

public class ActivationTokenException extends RuntimeException {
    public ActivationTokenException(String message) {
        super(message);
    }
}

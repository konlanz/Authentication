package com.kodelan.authcode.exeptions;

import lombok.Getter;

import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.FORBIDDEN;
import static org.springframework.http.HttpStatus.NOT_IMPLEMENTED;

public enum BusinessErrorCodes {
    NO_CODE(0, NOT_IMPLEMENTED, "No code"),
    INCORRECT_CURRENT_PASSWORD(300, BAD_REQUEST, "Current password is incorrect"),
    NEW_PASSWORD_DOES_NOT_MATCH(301, BAD_REQUEST, "The new password does not match"),
    ACCOUNT_LOCKED(302, FORBIDDEN, "User account is locked"),
    ACCOUNT_DISABLED(303, FORBIDDEN, "User account is disabled"),
    BAD_CREDENTIALS(304, FORBIDDEN, "Login and / or Password is incorrect"),
    DATA_DUPLICATION_ERROR(305, HttpStatus.CONFLICT, "Data duplication error"),
    RESOURCE_NOT_FOUND(404, HttpStatus.NOT_FOUND, "Requested resource not found"),
    METHOD_NOT_ALLOWED(405, HttpStatus.METHOD_NOT_ALLOWED, "Requested method not allowed"),
    INVALID_INPUT(406, HttpStatus.BAD_REQUEST, "Invalid input provided"),
    UNAUTHORIZED_ACCESS(401, HttpStatus.UNAUTHORIZED, "Unauthorized access"),
    SERVER_ERROR(500, HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error"),
    SERVICE_UNAVAILABLE(503, HttpStatus.SERVICE_UNAVAILABLE, "Service unavailable"),
    ;

    @Getter
    private final int code;
    @Getter
    private final String description;
    @Getter
    private final HttpStatus httpStatus;

    BusinessErrorCodes(int code, HttpStatus status, String description) {
        this.code = code;
        this.description = description;
        this.httpStatus = status;
    }
}

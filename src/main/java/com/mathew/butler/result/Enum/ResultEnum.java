package com.mathew.butler.result.Enum;

public enum ResultEnum {
    UNKNOWN_ERROR(-1, "system error"),
    SUCCESS(0, "success"),
    FAIL(1, "success");

    private int errorCode;
    private String message;
    
    ResultEnum(int errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }
    
    public int getErrorCode() {
        return errorCode;
    }
    
    public String getMessage() {
        return message;
    }
}

package com.mathew.butler.base.constants;

public enum Status {
    // 1XX informational
    CONTINUE(100),
    PROCESSING(102),
    CHECKPOINT(103),
    // 2XX Success
    OK(200),
    CREATED(201),
    ACCEPTED(202),
    // 3XX Redirection
    FOUND(302),
    // 4XX Client Error
    UNAUTHORIZED(401),
    CONFLICT(409),
    GONE(410);

    private int code;
    Status(int code) {
        this.code = code;
    }
    
}

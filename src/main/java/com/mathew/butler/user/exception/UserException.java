package com.mathew.butler.user.exception;

import com.mathew.butler.result.Enum.ResultEnum;

public class UserException extends RuntimeException {
    private int errorCode;
    
    public UserException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.errorCode = resultEnum.getErrorCode();
    }
    
    public int getErrorCode() {
        return errorCode;
    }
    
    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}

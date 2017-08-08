package com.mathew.butler.result.utils;

import com.mathew.butler.result.Enum.ResultEnum;
import com.mathew.butler.result.model.Result;

public class ResultUtils {

    public static Result success(Object object) {
        Result result = new Result();
        result.setErrorCode(ResultEnum.SUCCESS.getErrorCode());
        result.setMessage(ResultEnum.SUCCESS.getMessage());
        result.setData(object);
        return result;
    }

    public static Result success() {
        Result result = new Result();
        result.setErrorCode(ResultEnum.SUCCESS.getErrorCode());
        result.setMessage(ResultEnum.SUCCESS.getMessage());
        return result;
    }

    public static Result fail(int errorCode, String message) {
        Result result = new Result();

        if (errorCode == 0) {
            errorCode = ResultEnum.FAIL.getErrorCode();
        }
        result.setErrorCode(errorCode);
        result.setMessage(message);
        return result;
    }
}

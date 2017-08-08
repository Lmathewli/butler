package com.mathew.butler.handle;

import com.mathew.butler.result.Enum.ResultEnum;
import com.mathew.butler.result.model.Result;
import com.mathew.butler.result.utils.ResultUtils;
import com.mathew.butler.user.exception.UserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandle {
    private Logger logger = LoggerFactory.getLogger(ExceptionHandle.class);
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e) {
        if (e instanceof UserException) {
            return ResultUtils.fail(((UserException) e).getErrorCode(), e.getMessage());
        }
        logger.error("[system exception] {}", e);
        return ResultUtils.fail(ResultEnum.UNKNOWN_ERROR.getErrorCode(), e.getMessage());
    }
}

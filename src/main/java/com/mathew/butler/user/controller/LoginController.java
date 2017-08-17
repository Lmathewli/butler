package com.mathew.butler.user.controller;

import com.mathew.butler.base.result.Enum.ResultEnum;
import com.mathew.butler.base.result.model.Result;
import com.mathew.butler.base.result.utils.ResultUtils;
import com.mathew.butler.user.dao.UserDao;
import com.mathew.butler.user.model.User;
import com.mathew.butler.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private UserDao dao;
    @Autowired
    private UserService service;
    
    @PostMapping("/login")
    public Result login(@Valid User user, HttpServletRequest request, BindingResult validatorResult) {
        Result result = null;
        System.out.println(user);
        if (validatorResult.hasErrors()) {
            List<ObjectError> errors = validatorResult.getAllErrors();
            return ResultUtils.fail(ResultEnum.FAIL.getErrorCode(), validatorResult.getFieldError().getDefaultMessage());
        }
        return service.loginValid(user);
    }
    
    
}

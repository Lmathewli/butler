package com.mathew.butler.user.service;

import com.mathew.butler.result.model.Result;
import com.mathew.butler.result.utils.ResultUtils;
import com.mathew.butler.user.dao.UserDao;
import com.mathew.butler.user.model.User;
import com.mathew.butler.utils.core.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    
    @Autowired
    private UserDao dao;

    public User findOne(int id) {
        return dao.findOne(id);
    }
    @Transactional
    public void insertTwo() {
        User userA = new User();
        userA.setAge(26);
        userA.setName("h");
        dao.save(userA);
        
        User userB = new User();
        userB.setAge(27);
        userB.setName("hiih");
        dao.save(userB);
    }

    public Result loginValid(User user) {
        String account = user.getAccount();
        String password = user.getPassword();
        User userDb = dao.findByAccountEqualsAndPasswordEquals(account, password);
        if (Validator.isNull(userDb)) {
            return ResultUtils.fail(-1, "账号或者密码错误");
        }
        return ResultUtils.success();
    }
}

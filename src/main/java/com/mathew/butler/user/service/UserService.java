package com.mathew.butler.user.service;

import com.mathew.butler.result.Enum.ResultEnum;
import com.mathew.butler.user.dao.UserDao;
import com.mathew.butler.user.exception.UserException;
import com.mathew.butler.user.model.User;
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
    
    public void getAge(int id) throws UserException {
        User user = dao.findOne(id);
        int age = user.getAge();
        if (age < 20) {
            throw new UserException(ResultEnum.SCHOOL);
        } else if (age > 20 && age < 50) {
            throw new UserException(ResultEnum.WORK);
        }
    }
}

package com.mathew.butler.user.dao;

import com.mathew.butler.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {
    List<User> findByAge(int age);
    User findByAccountEqualsAndPasswordEquals(String account, String password);
    
}

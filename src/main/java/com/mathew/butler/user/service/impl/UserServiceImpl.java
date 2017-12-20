package com.mathew.butler.user.service.impl;

import com.mathew.butler.user.dao.UserRepository;
import com.mathew.butler.user.model.User;
import com.mathew.butler.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * 用户服务接口实现
 */
@Service
public class UserServiceImpl implements UserService, UserDetailsService {
    @Autowired
    private UserRepository userRepository;
    @Transactional
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    @Transactional
    @Override
    public User registerUser(User user) {
        return userRepository.save(user);
    }
    @Transactional
    @Override
    public void removeUser(long id) {
        userRepository.delete(id);
    }
    
    @Override
    public User getUserById(long id) {
        return userRepository.findOne(id);
    }
    
    @Override
    public Page<User> listUsersByNameLike(String name, Pageable pageable) {
        name = "%" + name + "%";
        Page<User> users = userRepository.findByNameLike(name, pageable);
        return users;
    }
    
    @Override
    public List<User> listUsersByUsernames(Collection<String> usernames) {
        return userRepository.findByNameIn(usernames);
    }
    
    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        return userRepository.findByNameLike(name);
    }
}

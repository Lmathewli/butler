package com.mathew.butler.user.controller;

import com.mathew.butler.user.dao.UserDao;
import com.mathew.butler.user.model.User;
import com.mathew.butler.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDao dao;
    @Autowired
    private UserService service;

    @PostMapping(value = "/users/addUser")
    public User add(@RequestBody @Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            System.out.printf(result.getFieldError().getDefaultMessage());
            return new User();
        }
        return dao.save(user);
    }
    @GetMapping(value = "/users/find/{id}")
    public User findOne(@PathVariable("id") Integer id) {
        return dao.findOne(id);
    }
    @PostMapping(value = "/users/updateOne/{id}")
    public User updateOne(@PathVariable("id") long id, String name, int age) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);

        return dao.save(user);
    }
    @DeleteMapping(value = "/users/delete/{id}")
    public void deleteOne(@PathVariable("id") Integer id) {
        dao.delete(id);
    }

    @GetMapping(value = "/users/findByAge/{age}")
    public List<User> findOneByAge(@PathVariable("age") int age) {
        return dao.findByAge(age);
    }

    @PostMapping(value = "/users/insertTwo")
    public void insertTwo() {
        service.insertTwo();
    }

    @GetMapping("/users/getById/{id}")
    public void getAge(@PathVariable("id") long id) throws Exception {
    }
}

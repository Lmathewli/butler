package com.mathew.butler;

import com.mathew.butler.user.model.User;
import com.mathew.butler.user.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService service;
    @Test
    public void findOneTest() {
        
        User user = service.findOne(11);
        Assert.assertEquals(16, user.getAge());
    }
}

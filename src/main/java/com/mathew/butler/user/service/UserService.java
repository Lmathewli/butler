package com.mathew.butler.user.service;

import com.mathew.butler.user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Collection;
import java.util.List;

public interface UserService {
    
    /**
     * 新增，编辑，保存用户
     * @param user
     * @return
     */
    User saveUser(User user);
    
    /**
     * 注册用户
     * @param user
     * @return
     */
    User registerUser(User user);
    
    /**
     * 删除用户
     * @param id
     */
    void removeUser(long id);
    
    /**
     * 根据用户名进行分页
     * @param id
     * @return
     */
    User getUserById(long id);
    
    /**
     * 根据用户名进行分页模糊查询
     * @param name
     * @param pageable
     * @return
     */
    Page<User> listUsersByNameLike(String name, Pageable pageable);
    
    /**
     * 更具名称列表查询
     * @param usernames
     * @return
     */
    List<User> listUsersByUsernames(Collection<String> usernames);
}

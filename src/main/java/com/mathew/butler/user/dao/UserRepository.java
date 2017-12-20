package com.mathew.butler.user.dao;

import com.mathew.butler.user.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByAge(int age);
    User findByAccountEqualsAndPasswordEquals(String account, String password);
    List<User> findByNameIn(Collection<String> names);
    Page<User> findByNameLike(String name, Pageable pageable);
    User findByNameLike(String name);
}

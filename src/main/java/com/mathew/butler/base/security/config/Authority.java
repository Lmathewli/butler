package com.mathew.butler.base.security.config;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

/**
 * 权限
 */
@Entity
public class Authority implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;// 用户唯一标识字段
    @Column(nullable = false)
    private String name;// 映射为字段，值不能为空
    
    public long getId() {
        return id;
    }
    
    public void setId(long id) {
        this.id = id;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String getAuthority() {
        return name;
    }
}

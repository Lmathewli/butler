package com.mathew.butler.role.model;

import com.mathew.butler.base.model.BaseModel;

import javax.persistence.Entity;

@Entity
public class Role extends BaseModel {
    private String role;
    private String description;
    
    public String getRole() {
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}

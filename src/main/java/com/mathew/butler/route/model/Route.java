package com.mathew.butler.route.model;

import com.mathew.butler.base.model.BaseModel;

import javax.persistence.Entity;

@Entity
public class Route extends BaseModel{
    private String description;
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}

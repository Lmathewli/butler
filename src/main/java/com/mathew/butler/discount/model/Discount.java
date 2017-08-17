package com.mathew.butler.discount.model;

import com.mathew.butler.base.model.BaseModel;

import javax.persistence.Entity;

@Entity
public class Discount extends BaseModel {
    private int kinds;
    private float discount;
    private String description;
    
    public int getKinds() {
        return kinds;
    }
    
    public void setKinds(int kinds) {
        this.kinds = kinds;
    }
    
    public float getDiscount() {
        return discount;
    }
    
    public void setDiscount(float discount) {
        this.discount = discount;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}

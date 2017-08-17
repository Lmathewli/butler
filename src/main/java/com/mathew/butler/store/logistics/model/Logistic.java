package com.mathew.butler.store.logistics.model;

import com.mathew.butler.base.model.BaseModel;
import com.mathew.butler.goods.model.Goods;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.util.List;

@Entity
public class Logistic extends BaseModel {
    private String name;
    private String phone;
    private String telephone;
    @Transient
    private List<Goods> goods;
    public List<Goods> getGoods() {
        return goods;
    }
    
    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getTelephone() {
        return telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}

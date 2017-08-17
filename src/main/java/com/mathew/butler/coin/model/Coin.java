package com.mathew.butler.coin.model;

import com.mathew.butler.base.model.BaseModel;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Coin  extends BaseModel {
    private long shopId;
    private double coin;
    private String name;
    private Date time;
    private String description;

    public Date getTime() {
        return time;
    }
    
    public void setTime(Date time) {
        this.time = time;
    }
    
    public long getShopId() {
        return shopId;
    }
    
    public void setShopId(long shopId) {
        this.shopId = shopId;
    }
    
    public double getCoin() {
        return coin;
    }
    
    public void setCoin(double coin) {
        this.coin = coin;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}

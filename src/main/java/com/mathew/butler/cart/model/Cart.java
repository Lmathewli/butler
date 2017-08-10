package com.mathew.butler.cart.model;

import com.mathew.butler.base.model.BaseModel;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Cart extends BaseModel {
    @OneToMany(mappedBy = "cart")
    private List<CartGoods> goods;
    
    private int shopId;
    
    private int userId;
    
    public List<CartGoods> getGoods() {
        return goods;
    }
    
    public void setGoods(List<CartGoods> goods) {
        this.goods = goods;
    }
    
    public int getShopId() {
        return shopId;
    }
    
    public void setShopId(int shopId) {
        this.shopId = shopId;
    }
    
    public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
}

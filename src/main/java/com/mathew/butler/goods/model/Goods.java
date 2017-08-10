package com.mathew.butler.goods.model;

import com.mathew.butler.base.model.BaseModel;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Goods extends BaseModel {
    private int status;
    
    private int type;

    private String name;
    
    private BigDecimal dealerPrice;
    
    private BigDecimal salePrice;
    
    private BigDecimal leaseInPrice;
    
    private BigDecimal leaseOutPrice;
    
    private BigDecimal washInPrice;
    
    private BigDecimal washOutPrice;
    
    private int num;
    
    private String icon;
    
    private String picture;
    
    private String detail;
    
    private int orderBy;
    
    private Date createTime;
    
    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    public int getType() {
        return type;
    }
    
    public void setType(int type) {
        this.type = type;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public BigDecimal getDealerPrice() {
        return dealerPrice;
    }
    
    public void setDealerPrice(BigDecimal dealerPrice) {
        this.dealerPrice = dealerPrice;
    }
    
    public BigDecimal getSalePrice() {
        return salePrice;
    }
    
    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }
    
    public BigDecimal getLeaseInPrice() {
        return leaseInPrice;
    }
    
    public void setLeaseInPrice(BigDecimal leaseInPrice) {
        this.leaseInPrice = leaseInPrice;
    }
    
    public BigDecimal getLeaseOutPrice() {
        return leaseOutPrice;
    }
    
    public void setLeaseOutPrice(BigDecimal leaseOutPrice) {
        this.leaseOutPrice = leaseOutPrice;
    }
    
    public BigDecimal getWashInPrice() {
        return washInPrice;
    }
    
    public void setWashInPrice(BigDecimal washInPrice) {
        this.washInPrice = washInPrice;
    }
    
    public BigDecimal getWashOutPrice() {
        return washOutPrice;
    }
    
    public void setWashOutPrice(BigDecimal washOutPrice) {
        this.washOutPrice = washOutPrice;
    }
    
    public int getNum() {
        return num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    
    public String getIcon() {
        return icon;
    }
    
    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    public String getPicture() {
        return picture;
    }
    
    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    public String getDetail() {
        return detail;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }
    
    public int getOrderBy() {
        return orderBy;
    }
    
    public void setOrderBy(int orderBy) {
        this.orderBy = orderBy;
    }
    
    public Date getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}

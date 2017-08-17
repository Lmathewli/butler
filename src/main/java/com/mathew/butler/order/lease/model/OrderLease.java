package com.mathew.butler.order.lease.model;

import com.mathew.butler.order.base.Order;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;
@Entity
public class OrderLease extends Order {
    private String shopId;
    private String name;
    private String account;
    
    private int num;
    private BigDecimal money;
    
    private int status;
    
    private Date createTime;
    
    private Date payTime;
    
    private int assignFlag;
    private Date assignTime;
    private int floor;
    
    private int factorySendFlag;
    private Date factorySendTime;
    
    private int logisticsReceiveFlag;
    private Date logisticsReceiveTime;
    
    private int logisticsSendFlag;
    private Date logisticsSendTime;
    
    private int hotelReceiveFlag;
    private Date hotelReceiveTime;
    
    public String getShopId() {
        return shopId;
    }
    
    public void setShopId(String shopId) {
        this.shopId = shopId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAccount() {
        return account;
    }
    
    public void setAccount(String account) {
        this.account = account;
    }
    
    public int getNum() {
        return num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    
    public BigDecimal getMoney() {
        return money;
    }
    
    public void setMoney(BigDecimal money) {
        this.money = money;
    }
    
    public int getStatus() {
        return status;
    }
    
    public void setStatus(int status) {
        this.status = status;
    }
    
    public Date getCreateTime() {
        return createTime;
    }
    
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public Date getPayTime() {
        return payTime;
    }
    
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
    
    public int getAssignFlag() {
        return assignFlag;
    }
    
    public void setAssignFlag(int assignFlag) {
        this.assignFlag = assignFlag;
    }
    
    public Date getAssignTime() {
        return assignTime;
    }
    
    public void setAssignTime(Date assignTime) {
        this.assignTime = assignTime;
    }
    
    public int getFloor() {
        return floor;
    }
    
    public void setFloor(int floor) {
        this.floor = floor;
    }
    
    public int getFactorySendFlag() {
        return factorySendFlag;
    }
    
    public void setFactorySendFlag(int factorySendFlag) {
        this.factorySendFlag = factorySendFlag;
    }
    
    public Date getFactorySendTime() {
        return factorySendTime;
    }
    
    public void setFactorySendTime(Date factorySendTime) {
        this.factorySendTime = factorySendTime;
    }
    
    public int getLogisticsReceiveFlag() {
        return logisticsReceiveFlag;
    }
    
    public void setLogisticsReceiveFlag(int logisticsReceiveFlag) {
        this.logisticsReceiveFlag = logisticsReceiveFlag;
    }
    
    public Date getLogisticsReceiveTime() {
        return logisticsReceiveTime;
    }
    
    public void setLogisticsReceiveTime(Date logisticsReceiveTime) {
        this.logisticsReceiveTime = logisticsReceiveTime;
    }
    
    public int getLogisticsSendFlag() {
        return logisticsSendFlag;
    }
    
    public void setLogisticsSendFlag(int logisticsSendFlag) {
        this.logisticsSendFlag = logisticsSendFlag;
    }
    
    public Date getLogisticsSendTime() {
        return logisticsSendTime;
    }
    
    public void setLogisticsSendTime(Date logisticsSendTime) {
        this.logisticsSendTime = logisticsSendTime;
    }
    
    public int getHotelReceiveFlag() {
        return hotelReceiveFlag;
    }
    
    public void setHotelReceiveFlag(int hotelReceiveFlag) {
        this.hotelReceiveFlag = hotelReceiveFlag;
    }
    
    public Date getHotelReceiveTime() {
        return hotelReceiveTime;
    }
    
    public void setHotelReceiveTime(Date hotelReceiveTime) {
        this.hotelReceiveTime = hotelReceiveTime;
    }
}

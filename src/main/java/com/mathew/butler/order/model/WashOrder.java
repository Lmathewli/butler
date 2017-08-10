package com.mathew.butler.order.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
@Entity
public class WashOrder extends Order {
    @Id
    @GeneratedValue
    private int id;
    private String orderId;
    
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
    private int logisticsReceiveFlag;
    private Date logisticsReceiveTime;
    
    private int hotelSendFlag;
    private Date hotelSendTime;
    
    private int logisticsSendFlag;
    private Date logisticsSendTime;
    
    private int factoryReceiveFlag;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getOrderId() {
        return orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
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
    
    public int getHotelSendFlag() {
        return hotelSendFlag;
    }
    
    public void setHotelSendFlag(int hotelSendFlag) {
        this.hotelSendFlag = hotelSendFlag;
    }
    
    public Date getHotelSendTime() {
        return hotelSendTime;
    }
    
    public void setHotelSendTime(Date hotelSendTime) {
        this.hotelSendTime = hotelSendTime;
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
    
    public int getFactoryReceiveFlag() {
        return factoryReceiveFlag;
    }
    
    public void setFactoryReceiveFlag(int factoryReceiveFlag) {
        this.factoryReceiveFlag = factoryReceiveFlag;
    }
    
    public Date getFactoryReceiveTime() {
        return factoryReceiveTime;
    }
    
    public void setFactoryReceiveTime(Date factoryReceiveTime) {
        this.factoryReceiveTime = factoryReceiveTime;
    }
    
    private Date factoryReceiveTime;
    
}

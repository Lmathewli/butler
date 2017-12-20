package com.mathew.butler.order.core;

import com.mathew.butler.order.base.Order;

public abstract class OrderStatus {
    protected Order order;
    
    public Order getOrder() {
        return order;
    }
    
    public void setOrder(Order order) {
        this.order = order;
    }
    
    /**
     * 新建订单
     * @param order
     */
    public abstract void created(Order order);
    
    /**
     * 支付完成
     * @param order
     */
    public abstract void payed(Order order);
    
    /**
     * 等待物流
     * @param order
     */
    public abstract void shopWaitLogistic(Order order);
    
    /**
     * 物流确认收货
     * @param order
     */
    public abstract void logisticReceiveGoods(Order order);

    /**
     * 酒店确认拉货
     * @param order
     */
    public abstract void shopConfirmGoodsSend(Order order);

    /**
     * 送至工厂
     * @param order
     */
    public abstract void logisticSendFactory(Order order);
    
    /**
     * 工厂确认收货
     * @param order
     */
    public abstract void factoryConfirmGoods(Order order);
    
    // 租赁
    /**
     * 系统指派工厂
     * @param order
     */
    public abstract void systemAssignFactory(Order order);
    
    /**
     * 工厂确认出库
     * @param order
     */
    public abstract void factorySendLogistic(Order order);
    
    /**
     * 物流确认收货
     * @param order
     */
    public abstract void logisticsConfirmGoods(Order order);
    
    /**
     * 物流开始送货
     * @param order
     */
    public abstract void logisticSendShop(Order order);
    
    /**
     * 物流确认酒店接货
     * @param order
     */
    public abstract void logisticConfirmShopReceive(Order order);
    
    /**
     * 酒店确认接货
     * @param order
     */
    public abstract void shopConfirmGoodsReceive(Order order);
}

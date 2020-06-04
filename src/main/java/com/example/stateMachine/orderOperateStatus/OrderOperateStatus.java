package com.example.stateMachine.orderOperateStatus;


/**
 *
 * 订单状态下调用对应的方法
 */
public interface OrderOperateStatus {

    // 支付
    void pay() ;
    // 发货
    void deliverGoods() ;
}

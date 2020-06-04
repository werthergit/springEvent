package com.example.stateMachine.orderOperateStatus;

/**
 *
 * Description:    状态设计模式测试订单状态
 */

public class Client {
    public static void main(String[] args){

        // 创建Order订单对象
        Order order = new Order() ;
        // 先调用支付，再调用发货
        order.pay();
        order.pay();
        order.pay();
        order.deliverGoods();
    }
}
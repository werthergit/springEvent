package com.example.stateMachine.orderOperateStatus;

/**
 *
 * Description:    付款状态下的操作
 */

public class PaidStatus implements OrderOperateStatus {

    @Override
    public void pay() {
        // 付款之后，在付款状态下的类就不能重复付款
        System.out.println("不要重复支付");
    }

    @Override
    public void deliverGoods() {
        // 付款之后，就需要发货
        System.out.println("发货成功");
    }
}

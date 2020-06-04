package com.example.stateMachine.orderOperateStatus;

/**
 * 待付款状态下的操作
 */
public class ObligationStatus implements OrderOperateStatus {


    @Override
    public void pay() {
        // 在待付款状态下的类，就需要调用支付的方法
        System.out.println("支付成功");
    }

    @Override
    public void deliverGoods() {
        // 待付款状态下的类，不能发货，只能先支付
        System.out.println("不在状态");
    }


}

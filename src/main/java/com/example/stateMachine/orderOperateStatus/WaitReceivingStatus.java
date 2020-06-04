package com.example.stateMachine.orderOperateStatus;

/**
 *
 * Description:    待收货状态下的操作
 */

public class WaitReceivingStatus implements OrderOperateStatus {

    @Override
    public void pay() {
        // 待收货状态下，就不能再付款了，因为已经付款了
        System.out.println("不在状态");
    }

    @Override
    public void deliverGoods() {
        // 待收货状态下，就不能在发货了，因为已经发货了
        System.out.println("不在状态");
    }
}

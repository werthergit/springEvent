package com.example.stateMachine.orderOperateStatus;

/**
 *
 * Description:    在执行完某个状态下的方法之后，然后设置当前订单的状态
 */

public class BaseOrder {
    protected OrderOperateStatus mStatus ;

    public void setStatus(OrderOperateStatus status){
        this.mStatus = status ;
    }
}

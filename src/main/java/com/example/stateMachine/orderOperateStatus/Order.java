package com.example.stateMachine.orderOperateStatus;

/**
 * Description:    订单的所有状态的类
 */

public class Order extends BaseOrder implements OrderOperateStatus {

    public Order(){
        // 默认的状态
        mStatus = new ObligationStatus() ;
    }


    @Override
    public void pay() {
        mStatus.pay();
        // 当前下的状态调用支付，然后把当前状态设置为已支付的状态
        setStatus(new PaidStatus());
    }

    @Override
    public void deliverGoods() {
        mStatus.deliverGoods();
        // 发货之后，把状态置为待收货状态
        setStatus(new WaitReceivingStatus());
    }
}

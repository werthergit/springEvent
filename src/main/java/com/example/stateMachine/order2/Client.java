package com.example.stateMachine.order2;

public class Client {

    public static void main(String[] args) {
        OrderContext orderContext = new OrderContext();
        orderContext.confirm();     //已预定状态>已确认状态
        orderContext.modify();      //已确认状态>已预定状态
        orderContext.confirm();    //已预定状态>已确认状态
        orderContext.modify();
        orderContext.pay();       //已确认状态>已锁定状态
        orderContext.modify();    //已锁定状态
    }
}

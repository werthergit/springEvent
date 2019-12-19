package com.example.springEvent.event;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

    public MyEvent(Object source) {
        super(source);
    }


    public void print(){
        System.out.println("hello spring event[MyEvent]");
    }
}

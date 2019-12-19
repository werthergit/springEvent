package com.example.springEvent.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTest {

    @Autowired
    private MyPubisher myPubisher;


    @Test
    public void t1(){

        myPubisher.publishEvent(new MyEvent("222"));
    }

}

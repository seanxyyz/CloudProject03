package com.service.qiaopr.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestQiaopr {

        QiaoprDelegate qiaoprDelegate = new QiaoprDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = qiaoprDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
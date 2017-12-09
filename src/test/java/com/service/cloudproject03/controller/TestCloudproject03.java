package com.service.cloudproject03.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCloudproject03 {

        Cloudproject03Delegate cloudproject03Delegate = new Cloudproject03Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = cloudproject03Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
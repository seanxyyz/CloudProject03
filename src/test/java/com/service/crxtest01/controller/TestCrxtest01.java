package com.service.crxtest01.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestCrxtest01 {

        Crxtest01Delegate crxtest01Delegate = new Crxtest01Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = crxtest01Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}
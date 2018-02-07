package com.ares.user.util;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {

	//与非运算
    @Before("!target(com.ares.user.service.impl.NaiveWaiter) && execution(* serveTo(..))")
    public void notServeInNaiveWaiter(){
        System.out.println("--notServeInNaiveWaiter() executed!--");
    }
    //与运算
    @After("within(com.ares.user.service.*) && execution(* greetTo(..))")
    public void greetToFun(){
        System.out.println("--greetToFun() executed!--");
    }
    //或运算
    @AfterReturning("target(com.ares.user.service.Waiter) || target(com.ares.user.service.Seller)")
    public void waiterOrSeller(){
        System.out.println("--waiterOrSeller() executed!--");
    }
}

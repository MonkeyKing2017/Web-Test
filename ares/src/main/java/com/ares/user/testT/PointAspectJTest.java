package com.ares.user.testT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ares.user.service.Waiter;

public class PointAspectJTest {
	@org.junit.Test
    public void pointAspectJTest() {
        String configPath = "beans.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
        Waiter naiveWaiter = (Waiter) ctx.getBean("naiveWaiter");
        Waiter naughtyWaiter = (Waiter) ctx.getBean("naughtyWaiter");
        naiveWaiter.greetTo("John");
        naiveWaiter.serveTo("John");
        naughtyWaiter.greetTo("Tom");
        naughtyWaiter.serveTo("Tom");
    }
}


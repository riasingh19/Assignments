package com.capgemini.springAssignment.Q9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static AbstractApplicationContext context;

	public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("springQ9.xml");
        context.registerShutdownHook();

        BeanLifeCycle beanLifeCycle=(BeanLifeCycle)context.getBean("LifeCycle");
        beanLifeCycle.display();
    }
}

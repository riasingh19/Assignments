package com.capgemini.springAssignment.Q10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static ApplicationContext context;

	public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("springQ10.xml");
        ContextAwareExample contextAwareExample = (ContextAwareExample) context.getBean("contextAware");
        contextAwareExample.display();

        ContextAwareExample contextAwareExample1 = (ContextAwareExample) context.getBean("contextAware1");
        contextAwareExample1.display();
    }
}
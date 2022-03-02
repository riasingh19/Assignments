package com.capgemini.springAssignment.Q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    private static ApplicationContext context;

	public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("spring1.xml");

        // using the setter injection
        Customer customer=(Customer) context.getBean("customer");
        customer.customerDetail();

        // using constructor injection
        Customer customerCon=(Customer) context.getBean("customerCon");
        customerCon.customerDetail();

    }
}
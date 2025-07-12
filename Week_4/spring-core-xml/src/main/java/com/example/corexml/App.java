package com.example.corexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Country country = context.getBean("country", Country.class);
        System.out.println("Loaded from XML:");
        System.out.println(country);
    }
}

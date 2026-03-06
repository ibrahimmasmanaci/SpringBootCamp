package com.example.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationAutowireByType.xml");
        Car myCarBean = (Car) context.getBean("myCar");
        myCarBean.displayDetails();
    }
}

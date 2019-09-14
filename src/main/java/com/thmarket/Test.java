package com.thmarket;

import com.thmarket.hello.HelloWorld;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("helloWorld");

        helloWorld.sayHello();
    }
}

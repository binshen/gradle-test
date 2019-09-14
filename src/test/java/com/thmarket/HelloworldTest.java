package com.thmarket;

import com.thmarket.hello.HelloWorld;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloworldTest {

    @Test
    public void helloWorldTest() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloWorld helloWorld = (HelloWorld) beanFactory.getBean("helloWorld");

        helloWorld.sayHello();
    }
}

package com.thmarket.inheritance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(locations = "classpath:InheritanceApp-context.xml")
public class InheritanceApp {

    @Autowired
    private SomeBean1 someBean1;

    @Autowired
    private SomeBean2 someBean2;

    @Test
    public void testInheritance() {
        System.out.println(someBean1);
        System.out.println(someBean2);
    }
}

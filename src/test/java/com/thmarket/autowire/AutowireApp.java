package com.thmarket.autowire;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(locations = "classpath:AutowireApp-context.xml")
public class AutowireApp {

    @Autowired
    private Person person;

    @Test
    public void testPerson() {
        System.out.println(person);
    }
}

package com.thmarket.been_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(locations = "classpath:BeanCreateApp-context.xml")
public class BeanCreateApp {

    @Autowired
    private Cat1 cat1;

    @Autowired
    private Cat2 cat2;

    @Autowired
    private Cat3 cat3;

    @Autowired
    private Cat4 cat4;

    @Test
    public void testCat1() {
        System.out.println(cat1);
    }

    @Test
    public void testCat2() {
        System.out.println(cat2);
    }

    @Test
    public void testCat3() {
        System.out.println(cat3);
    }

    @Test
    public void testCat4() {
        System.out.println(cat4);
    }
}

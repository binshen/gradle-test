package com.thmarket.been_test;

import org.springframework.beans.factory.FactoryBean;

public class Cat4Factory implements FactoryBean<Cat4> {

    // 实例工厂的方法
    @Override
    public Cat4 getObject() throws Exception {
        Cat4 cat4 = new Cat4();
        return cat4;
    }

    @Override
    public Class<?> getObjectType() {
        return Cat4.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}

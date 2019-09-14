package com.thmarket.autowire;

public class Person {

    private Dog dog;

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Persion [Dog=" + dog + "]";
    }
}

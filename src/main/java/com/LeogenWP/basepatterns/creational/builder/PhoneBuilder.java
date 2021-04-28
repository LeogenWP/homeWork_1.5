package com.LeogenWP.basepatterns.creational.builder;

public abstract class PhoneBuilder {
    Phone phone;
    void createPhone() {
        phone =  new Phone();
    }
    abstract void buildName();
    abstract void buildOS();
    abstract void buildPrice();

    Phone getPhone() {
        return phone;
    }
}

package com.LeogenWP.basepatterns.creational.builder;

public class Director {
    PhoneBuilder builder;

    public Director setBuilder(PhoneBuilder builder) {
        this.builder = builder;
        return this;
    }

    Phone buildPhone() {
        builder.createPhone();
        builder.buildName();
        builder.buildOS();
        builder.buildPrice();

        Phone phone = builder.getPhone();
        return phone;
    }
}

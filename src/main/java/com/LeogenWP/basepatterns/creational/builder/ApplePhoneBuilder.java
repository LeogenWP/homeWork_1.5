package com.LeogenWP.basepatterns.creational.builder;

public class ApplePhoneBuilder extends PhoneBuilder {
    @Override
    void buildName() {
        phone.setName("Iphone 10");
    }

    @Override
    void buildOS() {
        phone.setOs(OS.IOS);
    }

    @Override
    void buildPrice() {
        phone.setPrice(800);
    }
}

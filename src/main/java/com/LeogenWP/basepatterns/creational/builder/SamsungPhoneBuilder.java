package com.LeogenWP.basepatterns.creational.builder;

public class SamsungPhoneBuilder extends PhoneBuilder {
    @Override
    void buildName() {
        phone.setName("Samsung A52");
    }

    @Override
    void buildOS() {
        phone.setOs(OS.ANDROID);
    }

    @Override
    void buildPrice() {
        phone.setPrice(400);
    }
}

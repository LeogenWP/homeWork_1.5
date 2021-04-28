package com.LeogenWP.basepatterns.creational.builder;

public class BuildPhoneRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new SamsungPhoneBuilder());
        Phone phone = director.buildPhone();
        System.out.println(phone);
    }



}

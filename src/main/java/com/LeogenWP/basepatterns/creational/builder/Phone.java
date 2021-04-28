package com.LeogenWP.basepatterns.creational.builder;

public class Phone {
    private String name;
    private OS os;
    private int price;

    public Phone setName(String name) {
        this.name = name;
        return this;
    }

    public Phone setOs(OS os) {
        this.os = os;
        return this;
    }

    public Phone setPrice(int price) {
        this.price = price;
        return this;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", os=" + os +
                ", price=" + price +
                '}';
    }
}

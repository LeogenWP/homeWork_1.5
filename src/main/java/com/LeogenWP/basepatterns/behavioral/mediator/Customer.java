package com.LeogenWP.basepatterns.behavioral.mediator;

public class Customer implements Person{
    Bistro bistro;
    String name;

    public Customer(Bistro bistro, String name) {
        this.bistro = bistro;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public void takeOrder(String order) {
        System.out.println(this.name + " taking " + order);
    }

    @Override
    public void giveOrder(String order) {
        bistro.makeOrder(order, this);
    }
}

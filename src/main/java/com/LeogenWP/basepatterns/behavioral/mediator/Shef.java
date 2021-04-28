package com.LeogenWP.basepatterns.behavioral.mediator;

public class Shef implements Person{
    private Bistro bistro;
    private String name;

    public Shef(Bistro bistro, String name) {
        this.bistro = bistro;
        this.name = name;
    }

    public Shef setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public void takeOrder(String order) {
        System.out.println(this.name + " taking order: " + order);
    }

    @Override
    public void giveOrder(String order) {
        System.out.println(this.name + " giving order: " + order);
    }
}

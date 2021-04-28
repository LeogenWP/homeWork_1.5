package com.LeogenWP.basepatterns.structural.proxy;

public class MeatCook implements Job{
    private String name;
    public MeatCook(String name) {
        this.name = name;
        sayName();
    }

    @Override
    public void doJob() {
        System.out.println( name + " is chopping meat");
    }

    public void sayName() {
        System.out.println("Hello, I am " + name);
    }
}

package com.LeogenWP.basepatterns.behavioral.chain;

public class Lovers extends RestMenu{

    public Lovers(int customersNumber) {
        super(customersNumber);
    }

    @Override
    public void write(String message) {
        System.out.println("add a bottle of wine " + message);
    }
}

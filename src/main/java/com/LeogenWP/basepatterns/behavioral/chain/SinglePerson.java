package com.LeogenWP.basepatterns.behavioral.chain;

public class SinglePerson extends RestMenu{
    public SinglePerson(int customersNumber) {
        super(customersNumber);
    }

    @Override
    public void write(String message) {
        System.out.println("Make just one pizza " + message);
    }
}

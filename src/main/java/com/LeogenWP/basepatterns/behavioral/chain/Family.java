package com.LeogenWP.basepatterns.behavioral.chain;

public class Family extends RestMenu{
    public Family(int customersNumber) {
        super(customersNumber);
    }

    @Override
    public void write(String message) {
        System.out.println("we need more pizza, come here and count everyone");
    }
}

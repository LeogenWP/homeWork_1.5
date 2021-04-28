package com.LeogenWP.basepatterns.structural.bridge;

public class MeatCook implements Cook {
    @Override
    public void cook() {
        System.out.println("I am cooking meat..");
    }
}

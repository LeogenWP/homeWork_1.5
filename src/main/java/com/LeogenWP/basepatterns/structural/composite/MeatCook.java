package com.LeogenWP.basepatterns.structural.composite;

public class MeatCook implements Cook{
    @Override
    public void makeFood() {
        System.out.println("I am cooking meat");
    }
}

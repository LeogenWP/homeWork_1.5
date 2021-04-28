package com.LeogenWP.basepatterns.structural.flyweight;

public class MeatCook implements  Cook{
    @Override
    public void makeFood() {
        System.out.println("I am making meat");
    }
}

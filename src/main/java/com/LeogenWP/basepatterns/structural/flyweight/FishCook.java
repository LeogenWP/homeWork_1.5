package com.LeogenWP.basepatterns.structural.flyweight;

public class FishCook implements Cook{
    @Override
    public void makeFood() {
        System.out.println("I am making Fish");
    }
}

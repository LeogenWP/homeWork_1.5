package com.LeogenWP.basepatterns.structural.composite;

public class FishCook implements Cook{
    @Override
    public void makeFood() {
        System.out.println("I am cooking fish");
    }
}

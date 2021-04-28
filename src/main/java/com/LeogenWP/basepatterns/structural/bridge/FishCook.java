package com.LeogenWP.basepatterns.structural.bridge;

public class FishCook implements Cook{
    @Override
    public void cook() {
        System.out.println("I am cooking fish..");
    }
}

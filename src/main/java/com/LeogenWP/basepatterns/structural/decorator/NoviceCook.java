package com.LeogenWP.basepatterns.structural.decorator;

public class NoviceCook implements Cook{
    @Override
    public void makeFood() {
        System.out.println("Just cook, not taste");
    }
}

package com.LeogenWP.basepatterns.structural.decorator;

public class CookDecorator implements Cook{
    Cook cook;

    public CookDecorator(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void makeFood() {
        cook.makeFood();
    }
}

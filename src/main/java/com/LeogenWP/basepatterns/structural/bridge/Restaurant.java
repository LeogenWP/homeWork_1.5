package com.LeogenWP.basepatterns.structural.bridge;

public abstract class Restaurant {
    protected Cook cook;
   protected Restaurant(Cook cook) {
        this.cook = cook;
    }

    abstract void prepareFood();
}

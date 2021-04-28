package com.LeogenWP.basepatterns.structural.bridge;

public class MeatRestaurant extends Restaurant{
    MeatRestaurant(Cook cook) {
        super(cook);
    }

    @Override
    void prepareFood() {
        System.out.println("Meat restaurant prepares meat");
        cook.cook();
    }
}

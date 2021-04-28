package com.LeogenWP.basepatterns.structural.bridge;

public class FishRestaurant extends Restaurant{
    FishRestaurant(Cook cook) {
        super(cook);
    }

    @Override
    void prepareFood() {
        System.out.println("Fish restaurant prepares fish");
        cook.cook();
    }
}

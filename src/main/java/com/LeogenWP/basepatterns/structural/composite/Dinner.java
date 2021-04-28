package com.LeogenWP.basepatterns.structural.composite;

public class Dinner {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.addCook(new MeatCook());
        restaurant.addCook(new FishCook());
        restaurant.prepareDinner();
    }
}

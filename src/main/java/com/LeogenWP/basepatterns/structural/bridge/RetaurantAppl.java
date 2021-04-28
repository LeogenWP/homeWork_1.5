package com.LeogenWP.basepatterns.structural.bridge;

public class RetaurantAppl {
    public static void main(String[] args) {
        Restaurant[] restaurants = {
                new MeatRestaurant(new MeatCook()),
                new FishRestaurant(new FishCook())
        };
        for (Restaurant restaurant : restaurants ) {
            restaurant.prepareFood();
        }
    }
}

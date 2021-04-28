package com.LeogenWP.basepatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    List<Cook> cooks = new ArrayList<>();

    void addCook(Cook cook) {
        cooks.add(cook);
    }
    void removeCook(Cook cook) {
        cooks.remove(cook);
    }
    void prepareDinner() {
        System.out.println("Cooks preparing dinner");
        for (Cook cook : cooks) {
            cook.makeFood();
        }
    }
}

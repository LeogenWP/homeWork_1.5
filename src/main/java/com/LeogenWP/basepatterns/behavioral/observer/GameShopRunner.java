package com.LeogenWP.basepatterns.behavioral.observer;

public class GameShopRunner {
    public static void main(String[] args) {
        GamesShop shop = new GamesShop();
        shop.addGame("GTA4");
        shop.addGame("MINECRAFT");
        shop.addGame("They are Billions");

        shop.addObserver(new Customer("Bob"));
        shop.addObserver(new Customer("Mary"));
        shop.addGame("Far Cry");

    }
}

package com.LeogenWP.basepatterns.behavioral.observer;

import java.util.List;

public class Customer implements Observer{
    String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> games) {
        System.out.println("Hello, " + name + " we have new games in our shop. Come and check ;) "
                + "\n====================================================");
        for (String s : games) {
            System.out.print(" " + s);
        }
        System.out.println("\n");
    }
}

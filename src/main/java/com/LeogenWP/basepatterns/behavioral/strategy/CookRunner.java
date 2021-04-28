package com.LeogenWP.basepatterns.behavioral.strategy;

public class CookRunner {
    public static void main(String[] args) {
        Cook cook = new Cook();
        cook.setActivity(new Cooking());
        cook.doActivity();
    }
}

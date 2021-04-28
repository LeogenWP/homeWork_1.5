package com.LeogenWP.basepatterns.structural.decorator;

public class Task {
    public static void main(String[] args) {
        Cook cook = new ShefCook(new NoviceCook());
        cook.makeFood();
    }
}

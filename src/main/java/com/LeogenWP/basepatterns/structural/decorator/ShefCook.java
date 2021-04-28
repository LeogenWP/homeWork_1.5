package com.LeogenWP.basepatterns.structural.decorator;

public class ShefCook  extends CookDecorator {
    public ShefCook(Cook cook) {
        super(cook);
    }

    void ShefJob() {
        System.out.println("Taste food");
    }

    @Override
    public void makeFood() {
        super.makeFood();
        ShefJob();
    }
}

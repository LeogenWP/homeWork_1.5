package com.LeogenWP.basepatterns.behavioral.template;

public abstract class MenuTamplate {

    void showMenu() {
        System.out.println("Agg");
        showMainDish();
        System.out.println("Water");
    }

    abstract void showMainDish();

}

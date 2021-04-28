package com.LeogenWP.basepatterns.behavioral.chain;

public abstract class RestMenu {
    private int customersNumber;
    private RestMenu nextRestMenu;

    public RestMenu(int customersNumber) {
        this.customersNumber = customersNumber;
    }

    public RestMenu setNextRestMenu(RestMenu nextRestMenu) {
        this.nextRestMenu = nextRestMenu;
        return this;
    }

    public void notifyCook(String message, int customersNumber) {
        if (customersNumber >= this.customersNumber ) {
            write(message);
        }
        if (nextRestMenu != null) {
            nextRestMenu.notifyCook(message, customersNumber);
        }
    }

    public abstract void write(String message);
}

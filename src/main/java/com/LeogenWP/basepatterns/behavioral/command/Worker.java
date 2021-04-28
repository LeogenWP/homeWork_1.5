package com.LeogenWP.basepatterns.behavioral.command;

public class Worker {
    private Action cleanTable;
    private Action prepareFood;

    public Worker(Action cleanTable, Action prepareFood) {
        this.cleanTable = cleanTable;
        this.prepareFood = prepareFood;
    }

    public void cleanTable() {
        cleanTable.action();
    }

    public void prepareFood() {
        prepareFood.action();
    }
}

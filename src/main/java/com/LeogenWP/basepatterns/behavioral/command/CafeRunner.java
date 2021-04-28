package com.LeogenWP.basepatterns.behavioral.command;

public class CafeRunner {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        Worker worker = new Worker(
                new CleanTableAction(cafe),
                new PrepareFoodAction(cafe)
        );

        worker.prepareFood();
        worker.cleanTable();
    }

}

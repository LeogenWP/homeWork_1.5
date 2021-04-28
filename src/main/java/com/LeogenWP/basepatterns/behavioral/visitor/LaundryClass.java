package com.LeogenWP.basepatterns.behavioral.visitor;

public class LaundryClass implements RestaurantJob{
    @Override
    public void doJob(Worker worker) {
        worker.work(this);
    }
}

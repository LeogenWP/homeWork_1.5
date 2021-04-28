package com.LeogenWP.basepatterns.behavioral.visitor;

public class CookingClass implements RestaurantJob{
    @Override
    public void doJob(Worker worker) {
        worker.work(this);
    }
}

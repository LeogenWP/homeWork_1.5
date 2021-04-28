package com.LeogenWP.basepatterns.behavioral.visitor;

public class Restaurant implements RestaurantJob{
    RestaurantJob[] jobs;

    public Restaurant() {
        this.jobs = new RestaurantJob[] {
                new CookingClass(),
                new LaundryClass()
        };
    }


    @Override
    public void doJob(Worker worker) {
        for (RestaurantJob job : jobs) {
            job.doJob(worker);
        }
    }
}

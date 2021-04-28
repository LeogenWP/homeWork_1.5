package com.LeogenWP.basepatterns.behavioral.strategy;

public class Cook {
    Activity activity;

    public Cook setActivity(Activity activity) {
        this.activity = activity;
        return this;
    }

    public void doActivity() {
        activity.doActivity();
    }


}

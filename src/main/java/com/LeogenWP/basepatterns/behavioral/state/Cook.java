package com.LeogenWP.basepatterns.behavioral.state;

public class Cook {
    Activity activity;

    public Cook setActivity(Activity activity) {
        this.activity = activity;
        return this;
    }

    public void doActivity() {
        activity.doActivity();
    }

    void changeActivity() {
        if (activity instanceof Cooking) {
            setActivity(new Resting());
        } else if (activity instanceof Resting) {
            setActivity(new Speaking());
        } else if (activity instanceof Speaking) {
            setActivity(new Cooking());
        }
    }
}

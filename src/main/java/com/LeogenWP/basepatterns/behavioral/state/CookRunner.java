package com.LeogenWP.basepatterns.behavioral.state;

public class CookRunner {
    public static void main(String[] args) {
        Activity activity = new Cooking();
        Cook cook = new Cook();
        cook.setActivity(activity);

        for(int i =0 ; i < 10; i++) {
            cook.doActivity();
            cook.changeActivity();
        }
    }
}

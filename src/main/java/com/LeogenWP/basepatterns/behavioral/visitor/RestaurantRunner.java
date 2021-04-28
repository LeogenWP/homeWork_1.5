package com.LeogenWP.basepatterns.behavioral.visitor;

public class RestaurantRunner {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Worker master = new MasterChef();
        Worker student = new Student();

        restaurant.doJob(student);
    }



}

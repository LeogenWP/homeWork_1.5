package com.LeogenWP.basepatterns.behavioral.visitor;

public class Student implements Worker{
    @Override
    public void work(CookingClass cookingClass) {
        System.out.println("Makes common food");
    }

    @Override
    public void work(LaundryClass laundryClass) {
        System.out.println("Spends hours on laundry");
    }
}

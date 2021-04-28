package com.LeogenWP.basepatterns.behavioral.visitor;

public class MasterChef implements Worker{
    @Override
    public void work(CookingClass cookingClass) {
        System.out.println("Makes beautiful food");
    }

    @Override
    public void work(LaundryClass laundryClass) {
        System.out.println("Spends minutes on laundry");
    }
}

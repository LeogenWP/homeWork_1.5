package com.LeogenWP.basepatterns.behavioral.visitor;

public interface Worker {
    void work(CookingClass cookingClass);
    void work(LaundryClass laundryClass);

}

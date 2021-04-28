package com.LeogenWP.basepatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleBistro implements Bistro{
    Shef shef;
    List<Customer> customers = new ArrayList();

    public SimpleBistro setShef(Shef shef) {
        this.shef = shef;
        return this;
    }

    public void addCustomer (Customer customer) {
        customers.add(customer);
    }

    @Override
    public void makeOrder(String order, Person person) {
        for(Customer cus : customers) {
            if (cus == person) {
                cus.takeOrder(order);
            }
        }
        shef.takeOrder(order);
    }

    @Override
    public void giveOrder(String order) {
        System.out.println(order + " . bone appetite");
    }
}

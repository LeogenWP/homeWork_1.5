package com.LeogenWP.basepatterns.behavioral.mediator;

public class SimpleBistroRunner {
    public static void main(String[] args) {
        SimpleBistro bistro = new SimpleBistro();
        Shef shef = new Shef(bistro, "Big shef");
        Customer customer = new Customer(bistro,"Oleg");
        bistro.setShef(shef);
        bistro.addCustomer(customer);
        bistro.makeOrder("pizza",customer);

    }
}

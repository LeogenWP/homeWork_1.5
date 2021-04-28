package com.LeogenWP.basepatterns.creational.abstractfactory.forest;

import com.LeogenWP.basepatterns.creational.abstractfactory.Man;

public class Feller implements Man {
    @Override
    public void doManJob() {
        System.out.println("I am feller, I am chopping trees");
    }
}

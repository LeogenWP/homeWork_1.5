package com.LeogenWP.basepatterns.creational.abstractfactory.forest;

import com.LeogenWP.basepatterns.creational.abstractfactory.Woman;

public class Nurse implements Woman {
    @Override
    public void doWomanJob() {
        System.out.println("I am a nurse, I cure fellers");
    }
}

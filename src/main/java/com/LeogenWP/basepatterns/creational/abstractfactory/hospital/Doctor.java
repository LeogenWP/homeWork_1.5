package com.LeogenWP.basepatterns.creational.abstractfactory.hospital;

import com.LeogenWP.basepatterns.creational.abstractfactory.Woman;

public class Doctor implements Woman {
    @Override
    public void doWomanJob() {
        System.out.println("I am healing wounds, I am a doctor");
    }
}

package com.LeogenWP.basepatterns.creational.abstractfactory.hospital;

import com.LeogenWP.basepatterns.creational.abstractfactory.Man;

public class SecurityGuard implements Man {
    @Override
    public void doManJob() {
        System.out.println("I am guarding the area!");
    }
}

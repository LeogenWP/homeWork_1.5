package com.LeogenWP.basepatterns.creational.abstractfactory.hospital;

import com.LeogenWP.basepatterns.creational.abstractfactory.Man;
import com.LeogenWP.basepatterns.creational.abstractfactory.RescueTeamFactory;
import com.LeogenWP.basepatterns.creational.abstractfactory.Woman;

public class HospitalTeamFactory implements RescueTeamFactory {
    @Override
    public Man getMan() {
        return new SecurityGuard();
    }

    @Override
    public Woman getWoman() {
        return new Doctor();
    }
}

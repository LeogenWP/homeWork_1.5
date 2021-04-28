package com.LeogenWP.basepatterns.creational.abstractfactory.forest;

import com.LeogenWP.basepatterns.creational.abstractfactory.Man;
import com.LeogenWP.basepatterns.creational.abstractfactory.RescueTeamFactory;
import com.LeogenWP.basepatterns.creational.abstractfactory.Woman;

public class ForestTeamFactory implements RescueTeamFactory {
    @Override
    public Man getMan() {
        return new Feller();
    }

    @Override
    public Woman getWoman() {
        return new Nurse();
    }
}

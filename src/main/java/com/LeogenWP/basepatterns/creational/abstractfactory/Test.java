package com.LeogenWP.basepatterns.creational.abstractfactory;

import com.LeogenWP.basepatterns.creational.abstractfactory.forest.ForestTeamFactory;

public class Test {
    public static void main(String[] args) {
        RescueTeamFactory rescueTeamFactory = new ForestTeamFactory();
        Man man = rescueTeamFactory.getMan();
        Woman woman = rescueTeamFactory.getWoman();
        man.doManJob();
        woman.doWomanJob();

    }
}

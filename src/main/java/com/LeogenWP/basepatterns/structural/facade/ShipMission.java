package com.LeogenWP.basepatterns.structural.facade;

public class ShipMission {
    private boolean onMission;

    boolean isMissionActive() {
        return onMission;
    }

    void leavePort() {
        System.out.println("leaving port, mission is starting");
        onMission = true;
    }

    void  comeToPort() {
        System.out.println("We are in a port, all missions have been finished");
        onMission = false;
    }
}

package com.LeogenWP.basepatterns.structural.facade;

public class WorkFlow {
    private ShipMission shipMission = new ShipMission();
    private Sailor sailor = new Sailor();

    public void starShipMission() {
        shipMission.leavePort();
        sailor.doJob(shipMission.isMissionActive());
    }

    public static void main(String[] args) {
        WorkFlow flow = new WorkFlow();
        flow.starShipMission();
    }
}

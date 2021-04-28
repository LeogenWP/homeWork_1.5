package com.LeogenWP.basepatterns.structural.adapter;

public class AdapterCarRemoteController extends Car implements RemoteControlable{
    @Override
    public void turnOn() {
        startCar();
    }

    @Override
    public void turnOf() {
        shutdownCar();
    }

    @Override
    public void next() {
        moveForward();
    }

    @Override
    public void previous() {
        moveBackward();
    }
}

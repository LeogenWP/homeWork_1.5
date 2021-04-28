package com.LeogenWP.basepatterns.structural.adapter;

public class RemoteControleRunner {
    public static void main(String[] args) {
        RemoteControlable remote = new AdapterCarRemoteController();
        remote.turnOn();
        remote.next();
    }
}

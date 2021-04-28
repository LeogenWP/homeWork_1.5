package com.LeogenWP.basepatterns.structural.proxy;

public class CookRunner {
    public static void main(String[] args) {
        Job meatJob = new ProxyMeatCook("Bob");

        //meatJob.doJob();
    }
}

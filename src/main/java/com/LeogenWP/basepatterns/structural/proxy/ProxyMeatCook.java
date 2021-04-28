package com.LeogenWP.basepatterns.structural.proxy;

public class ProxyMeatCook implements Job{
    private String name;
    private MeatCook meatCook;

    public ProxyMeatCook(String name) {
        this.name = name;
    }

    @Override
    public void doJob() {
        if (meatCook == null) {
            meatCook = new MeatCook(name);
        }
        meatCook.doJob();
    }
}

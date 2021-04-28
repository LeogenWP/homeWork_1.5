package com.LeogenWP.basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CookFactory {
    private static final Map<String,Cook> cooks = new HashMap<>();
    public Cook getCookbySpecialty(String specialty) {
        Cook cook = cooks.get(specialty);
        if(cook == null) {
            switch (specialty) {
                case "meat":
                    System.out.println("Hiring MeatCook");
                    cook = new MeatCook();
                    break;
                case "fish":
                    System.out.println("Hiring FishCook");
                    cook = new FishCook();
                    break;

            }
            cooks.put(specialty,cook);

        }
        return cook;
    }
}

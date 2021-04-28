package com.LeogenWP.basepatterns.creational.factory;

public class HorseFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Horse();
    }
}

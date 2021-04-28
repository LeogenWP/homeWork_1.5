package com.LeogenWP.basepatterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        AnimalFactory animalFactory = createAnimalByName("CaT");
        Animal animal = animalFactory.createAnimal();
        animal.sayHello();
    }

    static AnimalFactory createAnimalByName(String name) {
        if(name.equalsIgnoreCase("cat")) {
            return new CatFactory();
        } else if (name.equalsIgnoreCase("dog")) {
            return new DogFactory();
        } else if (name.equalsIgnoreCase("horse")) {
            return new HorseFactory();
        } else {
            throw new RuntimeException(name + " is unknown");
        }
    }
}

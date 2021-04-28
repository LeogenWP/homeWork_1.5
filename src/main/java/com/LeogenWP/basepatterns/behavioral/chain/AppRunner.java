package com.LeogenWP.basepatterns.behavioral.chain;

public class AppRunner {
    public static void main(String[] args) {
        RestMenu singlePerson = new SinglePerson(1);
        RestMenu twoPersons = new Lovers(2);
        RestMenu family = new Family(3);
        singlePerson.setNextRestMenu(twoPersons);
        twoPersons.setNextRestMenu(family);

        singlePerson.notifyCook("Please be faster",4);

    }
}

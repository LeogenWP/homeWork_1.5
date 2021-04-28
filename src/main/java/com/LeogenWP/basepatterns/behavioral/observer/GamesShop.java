package com.LeogenWP.basepatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class GamesShop implements Observed{
    private List<String> games = new ArrayList<>();
    private List<Observer> customers = new ArrayList<>();

    public void addGame(String game) {
        games.add(game);
        notifyObservers();
    }

    public void removeGame(String game) {
        games.remove(game);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        customers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        customers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : customers) {
            o.handleEvent(games);
        }
    }
}

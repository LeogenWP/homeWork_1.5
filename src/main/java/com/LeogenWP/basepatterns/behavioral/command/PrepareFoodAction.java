package com.LeogenWP.basepatterns.behavioral.command;

import java.awt.event.ActionEvent;

public class PrepareFoodAction implements Action{
    private Cafe cafe;

    public PrepareFoodAction(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public void action() {
        cafe.prepareFood();
    }
}

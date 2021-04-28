package com.LeogenWP.basepatterns.behavioral.command;

public class CleanTableAction implements Action{
    private Cafe cafe;

    public CleanTableAction(Cafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public void action() {
        cafe.cleanTable();
    }
}

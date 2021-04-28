package com.LeogenWP.basepatterns.behavioral.memento;

public class GithubRepo {
    private Save save;

    public Save getSave() {
        return save;
    }

    public GithubRepo setSave(Save save) {
        this.save = save;
        return this;
    }
}

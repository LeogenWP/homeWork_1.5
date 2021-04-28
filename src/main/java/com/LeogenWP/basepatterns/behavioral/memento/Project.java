package com.LeogenWP.basepatterns.behavioral.memento;

import java.util.Date;

public class Project {
    private String version;
    private Date date;

    public Project(String version, Date date) {
        this.version = version;
        this.date = date;
    }

    public Save save () {
        return new Save(version);
    }

    public void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project{" +
                "version='" + version + '\'' +
                ", date=" + date +
                '}';
    }
}

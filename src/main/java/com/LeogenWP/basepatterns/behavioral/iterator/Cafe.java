package com.LeogenWP.basepatterns.behavioral.iterator;

public class Cafe implements Collection{
    private String name;
    private String[] menu;

    public Cafe(String name, String[] menu) {
        this.name = name;
        this.menu = menu;
    }

    public String getName() {
        return name;
    }

    public Cafe setName(String name) {
        this.name = name;
        return this;
    }

    public String[] getMenu() {
        return menu;
    }

    public Cafe setMenu(String[] menu) {
        this.menu = menu;
        return this;
    }

    @Override
    public Iterator getIterator() {
        return new MenuIterator();
    }

    private class MenuIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            return index < menu.length;
        }

        @Override
        public Object next() {
            return menu[index++];
        }
    }
}

package com.LeogenWP.basepatterns.behavioral.iterator;

public class CafeRunner {
    public static void main(String[] args) {
        String[] menu = {"pizza","soup","beer"};
        String name = "GreenHills";

        Cafe cafe = new Cafe(name,menu);
        Iterator iterator = cafe.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

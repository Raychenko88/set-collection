package org.example;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyLimitedSet set = new MyLimitedSet();

        set.add(1);
        set.contains(1);
        set.contains(1);
        set.add(2);
        set.contains(2);
        set.contains(2);
        set.add(3);
        set.contains(3);
        set.contains(3);
        set.add(4);
        set.contains(4);
        set.contains(4);
        set.add(5);
        set.contains(5);
        set.contains(5);
        set.add(6);
        set.contains(6);
        set.add(7);
        set.contains(7);
        set.add(8);
        set.contains(8);
        set.add(9);
        set.add(10);
        set.add(11);
        set.contains(11);
        set.contains(11);
        set.add(12);
        set.contains(12);
        set.contains(12);
        set.add(13);

        Iterator<MyLimitedSet.Entry> entries = set.iterator();
        while (entries.hasNext()) {
            MyLimitedSet.Entry entry = entries.next();
            System.out.println("Value: " + entry.value + "  comparisons: " + entry.counter);
        }
    }
}

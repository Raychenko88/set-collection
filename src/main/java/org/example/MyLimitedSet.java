package org.example;

import java.util.Arrays;
import java.util.Iterator;

public class MyLimitedSet<T> implements LimitedSet<T> {

    static class Entry<T> {
        T value;
        int counter = 0;
    }

    private Entry<T>[] array;

    private final int LENGTH = 10;

    MyLimitedSet() {

        array = new Entry[LENGTH];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Entry<>();
        }
    }

    Iterator iterator() {
        return Arrays.asList(array).iterator();
    }

    @Override
    public boolean contains(T t) {

        for (Entry<T> entry : array) {
            if (t.equals(entry.value)) {
                entry.counter++;
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(T t) {

        int min = LENGTH;
        int index = 0;
        boolean contains = false;

        for (int i = 0; i < array.length; i++) {
            if (t.equals(array[i].value)) {
                contains = true;
                break;
            } else if (min > array[i].counter) {
                min = array[i].counter;
                index = i;
            }
        }

        if (!contains) {
            array[index].value = t;
            array[index].counter = 0;
        }
    }

    @Override
    public boolean remove(T t) {

        for (int i = 0; i < array.length; i++) {

            if (t.equals(array[i].value)) {
                array[i] = new Entry<>();
                return true;
            }
        }
        return false;
    }
}

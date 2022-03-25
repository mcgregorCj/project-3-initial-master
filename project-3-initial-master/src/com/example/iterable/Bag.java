package com.example.iterable;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class Bag<T> implements Container<T> {

    // Creating a private List with the name "Bag"
    private List<T> bag;

    // Setting the List Bag as an ArrayList
    public Bag() {
        bag = new ArrayList<>();
    }

    // Checks to see if the ArrayList "Bag" is empty, returning true or false
    @Override
    public boolean isEmpty() {
        return this.bag.isEmpty();
    }

    // Returns the size of the ArrayList "Bag"
    @Override
    public int size() {
        return this.bag.size();
    }

    // Appends items to the end of the ArrayList "Bag"
    @Override
    public void add(T item) {
        this.bag.add(item);
    }

    // Iterates over the ArrayLIst "Bag", allows for continuous print.
    @Override
    public Iterator iterator() {
        return bag.iterator();
    }
}

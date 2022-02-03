package com.spartaglobal.sortmanager.model;

public class BinaryFactory extends SorterFactory{
    @Override
    public Sorter getInstance() {
        System.out.println("Binary Searching an Array for you!");
        return new BinarySearch();
    }
}

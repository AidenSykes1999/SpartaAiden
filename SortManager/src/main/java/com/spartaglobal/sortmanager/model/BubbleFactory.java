package com.spartaglobal.sortmanager.model;

public class BubbleFactory extends SorterFactory{
    @Override
    public Sorter getInstance() {
        System.out.println("Bubbling an Array for you!");
        return new BubbleSorter();
    }
}

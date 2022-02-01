package com.spartaglobal.sortmanager.model;

public class MergeFactory extends SorterFactory{
    @Override
    public Sorter getInstance() {
        System.out.println("Merging an Array for you!");
        return new MergeSorter();
    }
}

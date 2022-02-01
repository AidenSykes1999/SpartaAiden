package com.spartaglobal.sortmanager.model;

public class MergeFactory extends SorterFactory{
    @Override
    public Sorter getInstance() {

        return new MergeSorter();
    }
}

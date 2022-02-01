package com.spartaglobal.sortmanager.controller;

import com.spartaglobal.sortmanager.model.*;

import static com.spartaglobal.sortmanager.model.BubbleSorter.bubbleSort;
import static com.spartaglobal.sortmanager.model.MergeSorter.mergeSort;

public class SortController {

    public String initiateSort(String desiredSort) {
        Sorter s = getSorter(desiredSort);
        return s.sort();
    }

    // simple factory method
    public Sorter getSorter(String sorterType){

        SorterFactory sf = switch (sorterType.toLowerCase()){

            case "merge" ->
                new MergeFactory();

            case "bubble" ->
                new BubbleFactory();


            default -> null;
        };
        return sf.getInstance();
    }

}

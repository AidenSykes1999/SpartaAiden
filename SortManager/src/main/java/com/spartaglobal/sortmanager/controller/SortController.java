package com.spartaglobal.sortmanager.controller;

import com.spartaglobal.sortmanager.model.BubbleSorter;
import com.spartaglobal.sortmanager.model.MergeSorter;
import com.spartaglobal.sortmanager.model.Sorter;
import com.spartaglobal.sortmanager.model.SorterFactory;

public class SortController {

    public String initiateDriving(String desiredVehicleType) {
        Sorter s = getSorter(desiredVehicleType);
        return s.sort();
    }

    // simple factory method
    public Sorter getSorter(String sorterType){
        SorterFactory sf = switch (sorterType.toLowerCase()) {

            case "bubble":
                System.out.println("Creating a Bubble Sorter");
                new BubbleSorter();


            case "merge":
                System.out.println("Creating a Merge Sorter");
                new MergeSorter();

            default:
                System.out.println("Invalid Selection");

        };
        return sf.getInstance();
    }

}

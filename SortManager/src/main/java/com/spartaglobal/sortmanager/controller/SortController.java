package com.spartaglobal.sortmanager.controller;

import com.spartaglobal.sortmanager.model.*;

import java.util.logging.LogManager;

public class SortController {




    public String initiateSort(String desiredSort) {
        Sorter s = getSorter(desiredSort);
        return s.sort();
    }

    public Sorter getSorter(String sorterType){


        SorterFactory sf = switch (sorterType.toLowerCase()){

            case "merge" ->
                new MergeFactory();

            case "bubble" ->
                new BubbleFactory();

            default ->  { System.out.println("Unsupported request method: " + sorterType.toLowerCase());
            // yield instead of return
            yield null;}
        };

            return sf.getInstance();

    }

}

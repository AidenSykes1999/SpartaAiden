package com.spartaglobal.sortmanager.model;

import java.util.Arrays;

public class NumberArray {
    public static int[] arrayOfNumbers() {
        long seed = 48;

        int numArray[] = new int[40];
        int rand = (int) (Math.random() * 10);

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (Math.random() * 10);

        }

        return numArray;
    }
}


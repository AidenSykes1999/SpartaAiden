package com.spartaglobal.sortmanager;

import java.util.Arrays;

public class NumberArray {
    public static String arrayOfNumbers() {

        int numArray[] = new int[10];
        int rand = (int) (Math.random() * 10);

        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (Math.random() * 10);

        }

        return Arrays.toString(numArray);
    }

    public static void main(String[] args) {

        NumberArray numbers = new NumberArray();
        System.out.println(numbers.arrayOfNumbers());
    }

}


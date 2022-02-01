package com.spartaglobal.sortmanager;

import java.util.Arrays;

import static com.spartaglobal.sortmanager.BubbleSorter.bubbleSort;
import static com.spartaglobal.sortmanager.MergeSorter.mergeSort;

public class SorterDriver {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("========== Generate Array ==========");
        System.out.println();


        int[] numberTest = NumberArray.arrayOfNumbers();

        System.out.println(Arrays.toString(numberTest));

        System.out.println();
        System.out.println("==========  Bubble Sort   ==========");
        System.out.println();


        new BubbleSorter(numberTest); // Running Bubble Sort
        bubbleSort(numberTest);

        for(int i=0; i < numberTest.length; i++){
            System.out.print(numberTest[i] + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("==========   Merge Sort   ==========");
        System.out.println();

        new MergeSorter(numberTest); // Running Merge Sort
        mergeSort(numberTest,numberTest.length);

        for(int i=0; i < numberTest.length; i++){
            System.out.print(numberTest[i] + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("====================================");


    }


}

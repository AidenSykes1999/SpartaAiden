package com.spartaglobal.sortmanager.model;

import java.util.Arrays;

import static com.spartaglobal.sortmanager.SorterMain.logger;

public class BubbleSorter implements Sorter {

    public BubbleSorter(int[] numberTest) {
    }

    public BubbleSorter() {

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
        System.out.println("====================================");

    }

    public static void bubbleSort(int[] array){

        int count = array.length;

        if (count < 2){
            return;
        } // Validate lists that are exactly 1

        int temporary = 0;

        for(int i=0; i<count;i++){
            for (int j=1;j<(count-i);j++){
                if(array[j-1] > array[j]){ // Swap elements if larger
                    temporary = array[j-1]; // Store so value isn't lost
                    array[j-1] = array[j]; // If larger, array is moved left in the array
                    array[j] = temporary; // smaller value is moved right
                }
            }
        }

    }

    @Override
    public String sort() {
        return null;
    }
}

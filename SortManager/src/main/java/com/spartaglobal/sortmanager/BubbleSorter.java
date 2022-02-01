package com.spartaglobal.sortmanager;

import java.util.Arrays;

import static com.spartaglobal.sortmanager.NumberArray.arrayOfNumbers;

public class BubbleSorter {

    public BubbleSorter(int[] numberTest) {
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

}

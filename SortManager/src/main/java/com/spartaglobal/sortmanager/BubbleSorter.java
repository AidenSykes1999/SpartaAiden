package com.spartaglobal.sortmanager;

import java.util.Arrays;

import static com.spartaglobal.sortmanager.NumberArray.arrayOfNumbers;

public class BubbleSorter {

    public static void bubbleSort(int[] array){

        int count = array.length;
        int temporary = 0;

        for(int i=0; i<count;i++){
            for (int j=1;j<(count-i);j++){
                if(array[j-1] > array[j]){ // Swap elements if larger
                    temporary = array[j-1]; // Store so value isn't lost
                    array[j-1] = array[j];
                    array[j] = temporary;
                }
            }
        }


    }



    public static void main(String[] args) {

        int[] numbers = arrayOfNumbers();


        System.out.println("===== Array Before Bubble Sort =====");

        System.out.println(Arrays.toString(numbers));

        bubbleSort(numbers);

        System.out.println("===== Array After Bubble Sort ======");

        for(int i=0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("====================================");

    }

}

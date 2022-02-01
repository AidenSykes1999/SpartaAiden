package com.spartaglobal.sortmanager.model;

import java.util.Arrays;

public class MergeSorter implements Sorter {

    public MergeSorter(int[] numberTest) {
    }

    public MergeSorter() {

        System.out.println();
        System.out.println("========== Generate Array ==========");
        System.out.println();
        int[] numberTest = NumberArray.arrayOfNumbers();
        System.out.println(Arrays.toString(numberTest));
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

    public static void mergeSort(int[] array, int count){

        count = array.length;
        if (count < 2){
            return;
        } // Validate lists that are exactly 1

        int midpoint = count / 2; //find middle index

        int[] temporary = new int[midpoint]; //Middle Index
        int[] temporary2 = new int[count - midpoint]; // Second Middle index i.e if even number of values

        for (int i = 0; i < midpoint; i++) {
            temporary[i] = array[i];
        }
        for (int i = midpoint; i < count; i++) {
            temporary2[i - midpoint] = array[i];
        }

        mergeSort(temporary, count);
        mergeSort(temporary2, count - midpoint);

        merge(array, temporary, temporary2, midpoint, count - midpoint); // Merge function is called

        }

    public static void merge(
            int[] array, int[] temporary, int[] temporary2, int leftHandSide, int rightHandSide) { //Import from MergeSort

        int i = 0, j = 0, k = 0;
        while (i < leftHandSide && j < rightHandSide) {
            if (temporary[i] <= temporary2[j]) {
                array[k++] = temporary[i++];
            }
            else {
                array[k++] = temporary2[j++];
            }
        }
        while (i < leftHandSide) {
            array[k++] = temporary[i++];
        }
        while (j < rightHandSide) {
            array[k++] = temporary2[j++];
        }
    }

    @Override
    public String sort() {
        return null;
    }
}

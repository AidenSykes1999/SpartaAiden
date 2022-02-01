package com.spartaglobal.unittests;

import com.spartaglobal.sortmanager.BubbleSorter;
import com.spartaglobal.sortmanager.MergeSorter;
import com.spartaglobal.sortmanager.NumberArray;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.spartaglobal.sortmanager.BubbleSorter.bubbleSort;
import static com.spartaglobal.sortmanager.MergeSorter.mergeSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class SorterTests {

    @Test
    public void positiveMergeTest() {
        int[] actual = { 6, 2, 5, 1, 4, 3 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        mergeSort(actual, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void positiveBubbleTest() {
        int[] actual = {3, 6, 1, 2, 4, 5};
        int[] expected = {1, 2, 3, 4, 5, 6};
        bubbleSort(actual);
        assertArrayEquals(expected, actual);


    }

    @Test
    public void generateNumberArray() {
        int[] numberTest = NumberArray.arrayOfNumbers();
        String expected = Arrays.toString(numberTest);

    }

    @Test
    public void testingMainMethods() {
        int[] numberTest = NumberArray.arrayOfNumbers();
        new BubbleSorter(numberTest);
        new MergeSorter(numberTest);


    }


}

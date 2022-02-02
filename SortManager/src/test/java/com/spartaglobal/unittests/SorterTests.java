package com.spartaglobal.unittests;

import com.spartaglobal.sortmanager.model.BubbleFactory;
import com.spartaglobal.sortmanager.model.MergeFactory;
import com.spartaglobal.sortmanager.model.NumberArray;
import com.spartaglobal.sortmanager.SorterDriver;
import com.spartaglobal.sortmanager.viewer.SortView;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.spartaglobal.sortmanager.model.BubbleSorter.bubbleSort;
import static com.spartaglobal.sortmanager.model.MergeSorter.mergeSort;
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
    public void createBubbleSort() {
        BubbleFactory bubbleFactory = new BubbleFactory();
        bubbleFactory.getInstance();

    }

    @Test
    public void createMergeSort() {
        MergeFactory mergeFactory = new MergeFactory();
        mergeFactory.getInstance();
    }
}

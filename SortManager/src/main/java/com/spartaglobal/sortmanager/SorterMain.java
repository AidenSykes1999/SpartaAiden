package com.spartaglobal.sortmanager;

import com.spartaglobal.sortmanager.controller.SortController;
import com.spartaglobal.sortmanager.viewer.SortView;

import java.util.Scanner;

public class SorterMain {
    public static void main(String[] args) {
        SortView view = new SortView();
        String sortChoice = view.sortSelector();
        SortController controller = new SortController();
        String result = controller.initiateSort(sortChoice);


        view.displaySort(result);
    }
}
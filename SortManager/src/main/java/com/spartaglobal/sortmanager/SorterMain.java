package com.spartaglobal.sortmanager;

import com.spartaglobal.sortmanager.controller.SortController;
import com.spartaglobal.sortmanager.viewer.SortView;
import org.apache.logging.log4j.LogManager;

import java.util.Scanner;

public class SorterMain {
    //private static LogManager logger = LogManager.getLogManager("Sort Logger");
    public static void main(String[] args) {


        SortView view = new SortView();
        String sortChoice = view.sortSelector();
        SortController controller = new SortController();
        String result = controller.initiateSort(sortChoice);


        view.displaySort(result);
    }
}
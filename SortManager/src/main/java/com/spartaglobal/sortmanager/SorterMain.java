package com.spartaglobal.sortmanager;

import com.spartaglobal.sortmanager.controller.SortController;
import com.spartaglobal.sortmanager.viewer.SortView;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class SorterMain {

    public static Logger logger = LogManager.getLogger("Sort Logger");
    public static void main(String[] args) {

        boolean isRunning = true;
        ArrayList timeArray = new ArrayList();
        int runThroughs = 0;

        while (isRunning == true) {

            long startTime = System.nanoTime();
            System.out.println("=== ======================================================= ===");
            System.out.println("=== Available Commands: 'Merge', 'Bubble', 'Binary', 'Quit' ===");
            System.out.println("=== ======================================================= ===");
            logger.info("Looking for User Input");
            SortView view = new SortView();
            String sortChoice = view.sortSelector();
            logger.info("Attempting to perform a merge.");
            SortController controller = new SortController();
            String result = controller.initiateSort(sortChoice);
            view.displaySort(result);
            long stopTime = System.nanoTime();

            logger.info("Your sort took " + (stopTime - startTime) + " nano seconds to execute");

            timeArray.add(runThroughs,(stopTime - startTime));
            runThroughs++;

            System.out.println("Would you like to run another Method?");
            Scanner scanner = new Scanner(System.in);
            String selectContinue = scanner.next().toLowerCase();

            if(selectContinue.equals("no") || selectContinue.equals("n")){
                System.out.println("Your times are " + timeArray );
                isRunning = false;
            } else { isRunning = true; }
        }


    }
}
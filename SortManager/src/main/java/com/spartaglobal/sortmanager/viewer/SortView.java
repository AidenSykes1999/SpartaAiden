package com.spartaglobal.sortmanager.viewer;
import java.util.Scanner;
import java.util.logging.LogManager;

import static com.spartaglobal.sortmanager.SorterMain.logger;
import static com.spartaglobal.sortmanager.viewer.SortView.Choice.*;


public class SortView {



    public enum Choice {
        MERGE("merge"), BUBBLE("bubble"), QUIT("quit"), BINARY("binary");

        private final String choice;

        Choice(String name) {
            this.choice = name;
        }

        public String getChoice() { return getChoice(); }

    }

    public String sortSelector() {


        boolean validEnum = false;
        String selectChoice = null;

        while (validEnum == false) {
            System.out.println("Which Sort would you like to use?");
            Scanner scanner = new Scanner(System.in);
            selectChoice = scanner.next().toLowerCase();



            if (selectChoice.equals(BUBBLE.choice) || selectChoice.equals(MERGE.choice) || selectChoice.equals(QUIT.choice)
                    || selectChoice.equals(BINARY.choice)) {
                validEnum = true;
                if (selectChoice.equals(QUIT.choice)){
                    logger.warn("System Terminated");
                    System.out.println("Exiting: ");
                    System.exit(1);
                }

            }

            else {
                logger.warn("Incorrect Choice Selected");
                validEnum = false;
            }
        }
        return selectChoice;
    }

    public void displaySort(String result) {
        logger.info("Sort Successful!");

        System.out.println(result);

    }

}


package com.spartaglobal.sortmanager.viewer;
import java.util.Scanner;
import java.util.logging.LogManager;

import static com.spartaglobal.sortmanager.viewer.SortView.Choice.*;


public class SortView {



    public enum Choice {
        MERGE("merge"), BUBBLE("bubble"), QUIT("quit");

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

            if (selectChoice.equals(BUBBLE.choice) || selectChoice.equals(MERGE.choice) || selectChoice.equals(QUIT.choice)) {
                validEnum = true;

            } else {
                validEnum = false;
            }
        }
        return selectChoice;
    }

    public void displaySort(String result) {

        System.out.println(result);

    }

}


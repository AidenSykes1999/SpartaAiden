package com.spartaglobal.sortmanager.viewer;
import java.util.Scanner;


public class SortView {
    public String sortSelector() {

        System.out.println("Which Sort would you like to use?");
        Scanner scanner = new Scanner(System.in);
        String selectChoice = scanner.next();
        return selectChoice;

    }

    public void displaySort(String result) {

        System.out.println(result);

    }


}

package com.sparta.oop;

public class RetailStore {
    public static void main(String[] args) {

        Customer sykes = new Customer();
        sykes.setFirstName("Aiden");
        sykes.setLastName("Sykes"); // Use getters and setters
        sykes.setCustomerId(1);


        System.out.println(sykes.convertToString());


    }

}

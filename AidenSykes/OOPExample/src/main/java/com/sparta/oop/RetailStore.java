package com.sparta.oop;

public class RetailStore {
    public static void main(String[] args) {

        Customer sykes = new Customer();
        sykes.firstName = "Aiden";
        sykes.lastName = "Sykes";
        sykes.customerId = 1;



        System.out.println(sykes.convertToString());


    }

}

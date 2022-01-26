package com.sparta.oop;

public class Customer {

    String firstName;
    String lastName;
    int customerId;

    String convertToString(){

        return  "Customer #" + this.customerId +
                " : " + this.firstName + " " + this.lastName;

    }


}

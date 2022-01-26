package com.sparta.oop;

public class Customer {
    
    
    // All instance variables should be private. never public **possibly** protected
    private String firstName;
    private String lastName;
    private int customerId;

    public String convertToString(){

        return  "Customer #" + this.customerId +
                " : " + this.firstName + " " + this.lastName;

    }


}

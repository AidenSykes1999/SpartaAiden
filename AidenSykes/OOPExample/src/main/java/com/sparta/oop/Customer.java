package com.sparta.oop;

public class Customer {
    
    
    // All instance variables should be private. never public **possibly** protected. Private variables only available internally
    private String firstName;
    private String lastName;
    private int customerId;

    // methods should general be public due to being the face of your program

    public String convertToString(){

        return  "Customer #" + this.customerId +
                " : " + this.firstName + " " + this.lastName;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}

package com.sparta.oop;

public class Customer extends Person implements Comparable<Customer>{


    private int customerId;

    // methods should general be public due to being the face of your program

    public String toString(){

        return  "Customer #" + this.customerId +
                " : " + this.getFirstName() + " " + this.getLastName();

    }

    public int getCustomerId() {
        return customerId;
    }

    public Customer(String firstName, String lastName, int customerId) {
        super(firstName, lastName);
        this.customerId = customerId; // no return value
    }

    // DRY Don't Repeat Yourself


    public Customer(String lastName, int customerId) {
        this("no-name",lastName, customerId);

    }

    public Customer() {
        this("no-name","no-name", -1);
    }

    @Override
    public void delete() {

    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public int compareTo(Customer other) {
        return getFirstName().compareTo(other.getFirstName());
    }
}

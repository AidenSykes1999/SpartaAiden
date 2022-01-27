package com.sparta.oop;

public class RetailStore {
    public static void main(String[] args) {


        

        Customer sykes = new Customer("Aiden", "Sykes", 1);
        System.out.println(sykes);

        Employee aiden = new Employee();
        aiden.setFirstName("Aiden");
        aiden.setLastName("Sykes");
        aiden.setDepartmentName("Consultant");
        aiden.setSalary(500);
        System.out.println(aiden);


        Person thePerson = new Customer(); // Why does this work?
                                           // Because a customer IS A person






    }

}

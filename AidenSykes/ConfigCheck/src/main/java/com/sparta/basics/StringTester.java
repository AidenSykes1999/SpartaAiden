package com.sparta.basics;

public class StringTester {
    public static void main(String[]args){

        String name = "Aiden Sykes";
        System.out.println("The person's name is: " + name); //String Builder like a string but modifyable. Less stress
//        String newName = new String(name); // String which is on the heap, in addition to one on String pool
                                            // Can be done for security reasons, data can be deleted safely.

        String surname = name.substring(6); // doesn't create a new object, refers to original String offset 6
        name = null; // Cannot work, because surname references it. Would be a problem if referring to a huge String.
        surname = new String(name.substring(7)); // in heap, full name can be removed.

        System.out.printf("The name is: %s", surname); // Where %s substitutes the variable.


    }


}

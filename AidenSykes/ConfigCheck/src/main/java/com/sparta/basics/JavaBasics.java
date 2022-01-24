package com.sparta.basics;

import java.util.Locale;

public class JavaBasics {
    public static void main(String[] args){

        int myIndex = 0;
        // float, boolean, byte, short, long, double <-- primitive types
        // String,  <-- not primitive, capitalised therefore class
        boolean isOpen = true;
        String name = "Aiden";
        String anotherName = "Aiden"; //refers to the same string, works because Strings are immutable. Immutable meaning they cannot be changed.
        anotherName = name.toUpperCase();
        System.out.println("My name is " + name); // concatenation
        System.out.println("In upper case " + anotherName);
        String testName = new String("Aiden"); //creates a new String in the heap
        if(name == "Aiden")
            System.out.println("This is Aiden");




    }


}

package com.sparta.basics;

public class SomeExamples {
    public static void main(String[] args){
        int a = 5; // If one of these variables is a float, result is automatically promoted to a float rather than int
        int b = 19;

        System.out.println(b/a); // integer arithmetic is always truncated / rounded down
                                 // casting one variable will also change result into a double / floating point

        if(!(b > 12) || a < 8) // ! will reverse logic within a statement
            System.out.println("b is big");







    }


}

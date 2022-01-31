package com.spartaglobal.junit;

public class Program {
    public static void main(String[] args) {

        int timeOfDay = 21;

        if (timeOfDay >= 5 && timeOfDay <= 12){
            System.out.println("Good Morning!");
        }
        else if (timeOfDay >= 12 && timeOfDay <= 18){
            System.out.println("Good Afternoon");
        }
        else {
            System.out.println("Good Evening");
        }

    }



}

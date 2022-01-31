package com.spartaglobal.junit;

public class Program {
    public static void main(String[] args) {

        int timeOfDay = 21;

        System.out.println(greeting(timeOfDay));

    }

    public static String greeting(int timeOfDay) {

        String greeting;


        if (timeOfDay >= 5 && timeOfDay <= 12){
            greeting = "Good Morning";
        }
        else if (timeOfDay >= 12 && timeOfDay <= 18){
            greeting = "Good Afternoon";
        }
        else {
            greeting = "Good Evening";
        }
        return greeting;
    }


}

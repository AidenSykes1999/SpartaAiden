package com.sparta.basics;

public class Summer {
    public static void main (String[] args){
        int[] myInts = {1,2,3,4,5,6};
        Summer summer = new Summer();
        System.out.println(summer.sumArray(myInts));
    }

    public int sumArray(int[] theInts){
            int sum = 0; // initialize sum
            int i;
            // Iterate through all elements and add them to sum
            for (i = 0; i < theInts.length; i++)
                sum += theInts[i];
            return sum;
    }
}

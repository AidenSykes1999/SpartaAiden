package codekata;

import java.util.Random;

public class SecondLargestNumber {

    public static int SecondFind(int[] numArray){
        int total = 10;
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (numArray[i] > numArray[j])
                {
                    temp = numArray[i];
                    numArray[i] = numArray[j];
                    numArray[j] = temp;
                }
            }
        }

        System.out.println(numArray[total-2]);
        return numArray[total-2];


    }


    public static void main(String[] args) {


        Random r = new Random();
        int[] numArray = new int[10];

        for(int i=0; i<10; i++){

        numArray[i] = r.nextInt();

        }


        System.out.println(numArray);

        SecondFind(numArray);


    }



}

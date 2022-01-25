package com.sparta.basics;

public class EnumExample {



    public static void main(String[] args){



        DayIndex dayOfWeek;
        dayOfWeek = DayIndex.MONDAY;
        if(dayOfWeek == DayIndex.SATURDAY || dayOfWeek == DayIndex.SUNDAY)
            System.out.println("It's the weekend");
        else
            System.out.println("It's a weekday");



    }



}

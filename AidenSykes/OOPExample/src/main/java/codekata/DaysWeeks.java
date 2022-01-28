package codekata;

public class DaysWeeks {


    public static void dayWeek(int numDay){

        int weekCalc = numDay / 7;
        int dayCalc = numDay % 7;
        System.out.println(weekCalc + " Week(s) and " + dayCalc + " Day(s) ");

    }

    public static void main(String[] args) {

    dayWeek(8);



    }

}

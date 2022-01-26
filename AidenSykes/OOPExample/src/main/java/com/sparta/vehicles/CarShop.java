package com.sparta.vehicles;

import com.sparta.oop.Customer;

public class CarShop {

    public static void main(String[] args) {

        Vehicle myCar = new Vehicle();

        myCar.make = "Ford";
        myCar.model = "Puma";
        myCar.licensePlate = "SP4 RT4";
        myCar.price = 5000;
        myCar.engineSize = "Large";
        myCar.colour = "Red";
        myCar.status = "Brand-New";

        System.out.println(myCar.convertToString());


    }


}

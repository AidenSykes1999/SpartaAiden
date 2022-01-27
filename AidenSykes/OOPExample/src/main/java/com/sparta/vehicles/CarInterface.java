package com.sparta.vehicles;

import com.sparta.oop.Customer;

import java.util.ArrayList;
import java.util.Collections;

public class CarInterface {

    public static void main(String[] args) {

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Ford", "Jaguar", "Red","Large", "SP4 RT4", 2000, "Brand-new"));
        carList.add(new Car("Ford", "Focus", "Black","XLarge", "A1D 3N", 2000, "Brand-new"));
        carList.add(new Car("Super", "Car", "Blue","Large", "Y5 KES", 2000, "Damaged"));
        carList.add(new Car("Tesco", "Value", "Red","XLarge", "L33 DS", 2000, "Like-new"));
        carList.add(new Car("Asda", "Price", "Black","Large", "AW3 SOM", 2000, "Brand-new"));
        Collections.sort(carList);
        System.out.println(carList);
    }


}

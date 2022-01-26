package com.sparta.vehicles;

import com.sparta.oop.Customer;

public class Vehicle {


        String make;
        String model;
        String colour;
        String engineSize;
        String licensePlate;
        int price;
        String status;

        String convertToString() {

            return "The car " + this.licensePlate +
                    " is a  " + this.make + " , " + this.model + " Priced at " + this.price + " it comes in a "
                    + this.colour + " finish and has an engine size of " + this.engineSize + " It is currently "
                    + this.status;

        }

    }


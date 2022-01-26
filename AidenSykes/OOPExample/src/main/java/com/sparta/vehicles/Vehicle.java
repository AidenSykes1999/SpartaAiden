package com.sparta.vehicles;

import com.sparta.oop.Customer;

public class Vehicle {


        private String make;
        private String model;
        private String colour;
        private String engineSize;
        private String licensePlate;
        private int price;
        private String status;

        public String toString() {

            return "The car " + this.licensePlate +
                    " is a  " + this.make + " , " + this.model + " Priced at " + this.price + " it comes in a "
                    + this.colour + " finish and has an engine size of " + this.engineSize + " It is currently "
                    + this.status;

        }


        public String getMake() {
                return make;
        }

        public void setMake(String make) {
                this.make = make;
        }

        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        public String getColour() {
                return colour;
        }

        public void setColour(String colour) {
                this.colour = colour;
        }

        public String getEngineSize() {
                return engineSize;
        }

        public void setEngineSize(String engineSize) {
                this.engineSize = engineSize;
        }

        public String getLicensePlate() {
                return licensePlate;
        }

        public void setLicensePlate(String licensePlate) {
                this.licensePlate = licensePlate;
        }

        public int getPrice() {
                return price;
        }

        public void setPrice(int price) {
                this.price = price;
        }

        public String getStatus() {
                return status;
        }

        public void setStatus(String status) {
                this.status = status;
        }

        public Vehicle(String make, String model, String colour, String engineSize, String licensePlate, int price, String status) {
                this.make = make;
                this.model = model;
                this.colour = colour;
                this.engineSize = engineSize;
                this.licensePlate = licensePlate;
                this.price = price;
                this.status = status;
        }
}


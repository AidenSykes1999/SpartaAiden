package com.sparta.vehicles;

public abstract class Vehicle {
    protected String colour;
    protected String licensePlate;
    protected int price;
    protected String status;

    public Vehicle(String colour, String licensePlate, int price, String status) {
        this.colour = colour;
        this.licensePlate = licensePlate;
        this.price = price;
        this.status = status;
    }

    public abstract void delete();

    public Vehicle(){

    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
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

    public abstract int compareTo(Car other);
}

package com.sparta.shapes;

public class Square extends Shape{
    private double length;

    public Square (double length){
        this.length = length;
    }


    @Override
    public double calcArea() {
        return length * length;
    }
}

package com.sparta.oop;

import com.sparta.shapes.Circle;

import java.util.ArrayList;

public class PolyExample {

    public static void main(String[] args) {

        ArrayList<Object> objList = new ArrayList<>();
        objList.add("Hello");
        objList.add(new Customer("Aiden", "Sykes", 1));
        objList.add(new Circle(20));  // Can add any type of object.

        System.out.println(objList);



    }


}

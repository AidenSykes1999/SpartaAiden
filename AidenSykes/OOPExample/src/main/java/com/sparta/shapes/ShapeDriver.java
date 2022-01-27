package com.sparta.shapes;

import java.util.Random;

public class ShapeDriver {
    public static void main(String[] args){


        Circle c = new Circle (12.0);
        Square s = new Square (8.0);
        System.out.println(c.calcArea());
        System.out.println((s.calcArea()));
        Random r = new Random();
        Shape[] shapeArray = new Shape[5];
        for(int i=0; i<5; i++){
            if(r.nextDouble(1)<0.5)
                shapeArray[i] = new Circle(r.nextDouble());
            else
                shapeArray[i] = new Square((r.nextDouble()));



        }
        for(Shape sh: shapeArray)
            System.out.println(sh + " " + sh.getClass());



    }


}

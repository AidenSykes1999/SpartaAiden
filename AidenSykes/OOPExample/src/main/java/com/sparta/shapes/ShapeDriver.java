package com.sparta.shapes;

import java.util.Random;

public class ShapeDriver {
    public static void main(String[] args){


        Circle c = new Circle (12.0);
        Square s = new Square (8.0);

        Random r = new Random();
        Shape[] ShapeArray = new Shape[5];
        for(int i=0; i<5; i++){
            if(r.nextDouble(1)<0.5)
                ShapeArray[i] = new Circle(r.nextDouble());
            else
                ShapeArray[i] = Square((r.nextDouble()));
        }

        System.out.println(c.calcArea());
        System.out.println((s.calcArea()));





    }


}

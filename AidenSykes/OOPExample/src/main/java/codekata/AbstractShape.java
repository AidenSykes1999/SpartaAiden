package codekata;

public abstract class AbstractShape {

    public static void getArea(int length){

    }

    public abstract double getArea();


    @Override
    public String toString(){
        return "This shape has an area of " + getArea();
    }
}

package codekata;

public class AbstractCircle extends AbstractShape{

    private double length;

    public AbstractCircle (double length){

        this.length = length;

    }

    @Override
    public double getArea() {
        return  length *  length * 3.14;
    }

}

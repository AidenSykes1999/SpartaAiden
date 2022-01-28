package codekata;

public class AbstractSquare extends AbstractShape{

    private double length;

    public AbstractSquare (double length){

        this.length = length;

    }

    @Override
    public double getArea() {
        return length * length;
    }


}

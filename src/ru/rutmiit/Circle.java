package ru.rutmiit;

import java.text.DecimalFormat;

public class Circle extends Polygon{

    public Circle(int[] sides) {
        super(sides);
        if (sides.length != 1){
            throw new IllegalArgumentException("It is not a circle");
        }
    }

    @Override
    protected double getPerimeter() {
        double r = sides[0];
        return 2 * Math.PI * r;
    }

    private double getArea() {
        double r = sides[0];
        return Math.PI * r * r;
    }

    @Override
    public String toString(){
        return "Circle radius is " + sides[0] +
                "\nIts perimeter is " + new DecimalFormat("#0.00").format(getPerimeter()) + "" +
                "\nIts area is " + new DecimalFormat("#0.00").format(getArea());
    }
}

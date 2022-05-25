package ru.rutmiit;

import java.util.Arrays;

public class Polygon {
    protected int[] sides;

    public Polygon(int[] sides) {

        if(!(sides.length == 1 || sides.length >= 3))
            throw new IllegalArgumentException("Invalid value to sides number");

        for(int side : sides) {
            if(side <= 0) {
                throw new IllegalArgumentException("Negative value to side length " + side);
            }
        }

        for(int side : sides) {
            if (sides.length >= 3 && side > Arrays.stream(sides).sum() - side)
                throw new IllegalArgumentException("Wrong value to side length " + side);
        }

        this.sides = sides;
    }

    protected int getSidesCount() {
        return sides.length;
    }

    protected double getPerimeter() {
        return Arrays.stream(sides).sum();
    }

    @Override
    public String toString(){
        return "Polygon contains " + getSidesCount() + " sides" +
                "\nIts perimeter is " + getPerimeter();
    }
}

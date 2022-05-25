package ru.rutmiit;

import java.util.Arrays;

public class Rhombus extends Parallelogram{
    public Rhombus(int[] sides) {
        super(sides);

        boolean allEqual = Arrays.stream(sides).distinct().count() == sides[0];

        if (!allEqual) {
            throw new IllegalArgumentException("all sides should be equal");
        }
    }

    @Override
    public String toString(){
        return "Rhombus contains " + getSidesCount() + " equal sides" +
                "\nIts perimeter is " + getPerimeter();
    }
}

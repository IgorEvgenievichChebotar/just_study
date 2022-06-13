package ru.rutmiit;

public class Quadrilateral extends Polygon {
    public Quadrilateral(int[] sides) {
        super(sides);
        if (sides.length != 4) {
            throw new IllegalArgumentException("It is not a quadrilateral");
        }
    }

    @Override
    public String toString() {
        return "Quadrilateral contains" + getSidesCount() + " sides" +
                "\nIts perimeter is " + getPerimeter();
    }

}

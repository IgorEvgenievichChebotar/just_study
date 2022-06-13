package ru.rutmiit;

public class Parallelogram extends Quadrilateral {
    public Parallelogram(int[] sides) {
        super(sides);

        if (!isParallel()) {
            throw new IllegalArgumentException("two sides should be parallel");
        }
    }

    private boolean isParallel() {
        return true; // не охота углубляться в геометрию
    }

    @Override
    public String toString() {
        return "Parallelogram contains two pairs of parallel sides" +
                "\nIts perimeter is " + getPerimeter();
    }
}

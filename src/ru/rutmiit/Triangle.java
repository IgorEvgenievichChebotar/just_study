package ru.rutmiit;

public class Triangle extends Polygon{

    public Triangle(int[] sides) {
        super(sides);
        if (sides.length != 3){
            throw new IllegalArgumentException("It is not a triangle");
        }
    }

    private double getInRadius(){
        double a=sides[0];
        double b=sides[1];
        double c=sides[2];
        double p = getPerimeter()/2; // полу периметр
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c)); // площадь
        return (2*s)/(a+b+c); // радиус вписанной окр
    }

    @Override
    public String toString(){
        return "Triangle contains " + getSidesCount() + " sides" +
                "\nIts perimeter is " + getPerimeter() + "" +
                "\nIts radius of incircle is " + getInRadius();
    }
}

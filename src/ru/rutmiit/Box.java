package ru.rutmiit;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public void setLength(double length) {
        if(length <= 0){
            throw new IllegalArgumentException("Длина отрицательной быть не может");
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if(width <= 0){
            throw new IllegalArgumentException("Ширина отрицательной быть не может");
        }
        this.width = width;
    }

    public void setHeight(double height) {
        if(height <= 0){
            throw new IllegalArgumentException("Высота отрицательной быть не может");
        }
        this.height = height;
    }

    public double calculateSurfaceArea (){
        return 2*(length*width+length*height+width*height);
    }

    public double calculateLateralSurfaceArea (){
        return 2*(length*height+width*height);
    }

    public double calculateVolume (){
        return length*width*height;
    }
}

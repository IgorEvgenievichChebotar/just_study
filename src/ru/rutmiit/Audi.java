package ru.rutmiit;

public class Audi implements Car{

    private final String model;
    private final String color;
    private final String countryProduced;
    private final int horsePower;

    public Audi(String model, String color, int horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.countryProduced = countryProduced;
        this.horsePower = horsePower;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString(){
        return "This is " + getModel() +" produced in "+ countryProduced + " and have " + TIRES + " tires";
    }
}

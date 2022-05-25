package ru.rutmiit;

public class Car extends Vehicle{

    private int horsePower;
    private String model;

    public Car(int passengers, int horsePower, String model) {
        super(passengers);
        setHorsePower(horsePower);
        setModel(model);
    }

    private void setHorsePower(int horsePower) {
        if(horsePower<0){
            throw new IllegalArgumentException("Invalid negative number");
        }
        this.horsePower = horsePower;
    }

    private void setModel(String model) {
        if(model.length()<2){
            throw new IllegalArgumentException("Invalid short value");
        }
        this.model = model;
    }

    @Override
    public String toString(){
        return "In a Car " + passengers + " passengers With " + horsePower + " horse power on " + model;
    }
}
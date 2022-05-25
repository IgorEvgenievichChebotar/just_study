package ru.rutmiit;

public class Vehicle {
    protected  int passengers;

    public Vehicle(int passengers) {
        setPassengers(passengers);
    }

    protected void setPassengers(int passengers) {
        if(passengers<0){
            throw new IllegalArgumentException();
        }
        if (passengers<1){
            throw new IllegalArgumentException("Need passengers to drive");
        }
        this.passengers = passengers;
    }
}

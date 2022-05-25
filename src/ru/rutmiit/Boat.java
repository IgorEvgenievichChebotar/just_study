package ru.rutmiit;

public class Boat extends Vehicle {

    private int oarsCount;

    public Boat(int passengers, int oarsCount) {
        super(passengers);
        setOarsCount(oarsCount);
    }

    private void setOarsCount(int oarsCount) {
        if(oarsCount<0)
            throw new IllegalArgumentException("Invalid negative number");
        if(oarsCount==0)
            throw new IllegalArgumentException("\"Need oars to\n" + "swim\"");
        if(oarsCount>super.passengers*2)
            throw new IllegalArgumentException("\"One too many\n" + "oars\"");
        this.oarsCount = oarsCount;
    }

    @Override
    public String toString(){
        return "In a Boat " + passengers + " passengers With " + oarsCount + " oars";
    }
}

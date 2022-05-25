package ru.rutmiit;

public class Airplane extends Vehicle{

    private int wingsCount;
    private int enginesNumber;
    private  boolean isHydroplane;

    public Airplane(int passengers, int wingsCount, int enginesNumber, boolean isHydroplane) {
        super(passengers);
        setWingsCount(wingsCount);
        setEnginesNumber(enginesNumber);
        setHydroplane(isHydroplane);
    }

    private void setWingsCount(int wingsCount) {
        if(wingsCount<0)
            throw new IllegalArgumentException("Invalid negative number");
        if(wingsCount==0)
            throw new IllegalArgumentException("Need wings to fly");
        this.wingsCount = wingsCount;
    }

    private void setEnginesNumber(int enginesNumber) {
        if(enginesNumber<0)
            throw new IllegalArgumentException("Invalid negative number");
        if(enginesNumber > 12 || enginesNumber == 11 || enginesNumber == 9)
            throw new IllegalArgumentException("Invalid engines number");
        this.enginesNumber = enginesNumber;
    }

    private void setHydroplane(boolean hydroplane) {
        isHydroplane = hydroplane;
    }

    @Override
    public String toString(){
        if(isHydroplane){
            return "In a Hydroplane "+passengers+" passengers With "+wingsCount+" wings and "+enginesNumber+" engines";
        }
        else{
            return "In an Airplane "+passengers+" passengers With "+wingsCount+" wings and "+enginesNumber+" engines";
        }
    }
}

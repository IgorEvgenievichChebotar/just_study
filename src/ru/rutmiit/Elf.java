package ru.rutmiit;

public class Elf extends Hero{

    private int arrowsCount;

    public Elf(String username, int level, int arrowsCount) {
        super(username, level);
        setArrowsCount(arrowsCount);
        System.out.println("Elf " + username + " lvl[" + level + "] is online");
    }

    private void setArrowsCount(int arrowsCount) {
        if(arrowsCount < 1 || arrowsCount > 100)
            throw new IllegalArgumentException("Wrong value to elf’s arrows count");
        this.arrowsCount = arrowsCount;
    }

    private boolean shootArrow() {
        if(arrowsCount>0){
            arrowsCount--;
            return true;
        }
        else
            return false;
    }

    @Override
    public String action(){
        if(shootArrow())
            return username + " shoot arrow\n";
        else
            return username + " has no more arrows\n";
    }
}

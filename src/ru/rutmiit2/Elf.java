package ru.rutmiit2;

public class Elf extends Hero{

    protected int arrowsCount;

    public Elf(String username, int level, int health, int arrowsCount) {
        super(username, level, health);
        setArrows(arrowsCount);
        super.weapon = new Bow(1);
        System.out.print(this);
    }

    private void setArrows(int arrowsCount) {
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
    public boolean useItem(int number) {
        if (number > items.size()) {
            System.out.println("Empty slot");
            return false;
        }
        Item item = this.items.get(number-1);
        if (item instanceof HealthPotion) {
            this.health += item.use();
            System.out.println(username + " use " + item);
            this.items.remove(number-1);
            return true;
        }
        else{
            System.out.println("Wrong potion to Elf\n");
            return false;
        }
    }

    @Override
    public boolean change(Weapon weapon) {
        if (weapon instanceof Bow) {
            this.weapon = weapon;
            System.out.println(username + " change weapon");
            return true;
        }
        else {
            System.out.println("Wrong weapon");
            return false;
        }
    }

    @Override
    public String action(){
        if(shootArrow())
            return username + " shoot arrow [" + arrowsCount + " arrows left]\n";
        else
            return username + " has no more arrows\n";
    }

    @Override
    public String toString() {
        return String.format("Elf %s [%d level, %d health] is online\n", username, level, health);
    }
}

package ru.rutmiit2;

import java.io.Serial;

public class Elf extends Hero {

    @Serial
    private static final long serialVersionUID = 7673451662132418612L;
    private int arrowsCount;

    public Elf(String username, int level, int health, int arrowsCount) {
        super(username, level, health);
        setArrows(arrowsCount);
        change(new Bow(1));
        System.out.print(this);
    }

    private void setArrows(int arrowsCount) throws IllegalArgumentException {
        if (arrowsCount < 1 || arrowsCount > 100)
            throw new IllegalArgumentException("Wrong value to elf’s arrows count");
        this.arrowsCount = arrowsCount;
    }

    private boolean shootArrow() {
        if (arrowsCount > 0) {
            arrowsCount--;
            return true;
        } else
            return false;
    }

    @Override
    public boolean useItem(int number) {
        if (number > getItems().size()) {
            System.out.println("Empty slot");
            return false;
        }
        Item item = getItems().get(number - 1);
        if (item instanceof HealthPotion) {
            setHealth(getHealth()+ item.use());
            System.out.println(getUsername() + " use " + item);
            getItems().remove(number - 1);
            return true;
        } else {
            System.out.println("Wrong potion to Elf\n");
            return false;
        }
    }

    @Override
    public String action() {
        if (shootArrow())
            return getUsername() + " shoot arrow [" + arrowsCount + " arrows left]\n";
        else
            return getUsername() + " has no more arrows\n";
    }

    @Override
    public String toString() {
        return String.format("Elf %s [%d level, %d health]\n", getUsername(), getLevel(), getHealth());
    }
}

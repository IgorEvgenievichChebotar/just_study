package ru.rutmiit2;

import java.io.Serial;

public class Knight extends Hero{

    @Serial
    private static final long serialVersionUID = -4041877173634656934L;
    public int MAX_STRENGTH = 100;
    private int strength;
    private int force;

    public Knight(String username, int level, int health, int strength, int force) {
        super(username, level, health);
        setStrength(strength);
        setForce(force);
        change(new Sword(1));
        System.out.print(this);
    }

    private void setStrength(int strength) throws IllegalArgumentException {
        if (strength < 1 || strength > MAX_STRENGTH)
            throw new IllegalArgumentException("Wrong value to knight’s strength");
        this.strength = strength;
    }

    private void setForce(int force) throws IllegalArgumentException {
        if (force < 0 || force > strength)
            throw new IllegalArgumentException("Wrong value to knight’s force impact");
        this.force = force;
    }

    private boolean fight() {
        if (strength - force >= 0) {
            strength -= force / getWeapon().getAbility();
            return true;
        } else {
            return false;
        }
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
        } else if (item instanceof Food) {
            this.strength += item.use();
            System.out.println(getUsername() + " use " + item);
            getItems().remove(number - 1);
            return true;
        } else {
            System.out.println("Wrong potion to Knight\n");
            return false;
        }
    }

    @Override
    public String action() {
        if (fight())
            return getUsername() + " fight with force " + force + " [" + strength + " strength left]\n";
        else
            return getUsername() + " has no more strength\n";
    }

    @Override
    public String toString() {
        return String.format("Knight %s [%d level, %d health]\n", getUsername(), getLevel(), getHealth());
    }
}

package ru.rutmiit2;

import java.io.Serial;

public class Wizard extends Hero {

    @Serial
    private static final long serialVersionUID = 1385108919570595106L;
    public int MAX_MANA = 100;
    private int mana;
    private int spell;

    public Wizard(String username, int level, int health, int mana, int spell) {
        super(username, level, health);
        setMana(mana);
        setSpell(spell);
        change(new Staff(1));
        System.out.print(this);
    }

    private void setMana(int mana) throws IllegalArgumentException {
        if (mana < 1 || mana > MAX_MANA)
            throw new IllegalArgumentException("Wrong value to wizard’s mana");
        this.mana = mana;
    }

    private void setSpell(int spell) throws IllegalArgumentException {
        if (spell < 0 || spell > mana)
            throw new IllegalArgumentException("Wrong value to wizard’s spell power");
        this.spell = spell;
    }

    private boolean spell() {
        if (mana - spell >= 0) {
            mana -= spell / getWeapon().getAbility();
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
        } else if (item instanceof ManaPotion) {
            this.mana += item.use();
            System.out.println(getUsername() + " use " + item);
            getItems().remove(number - 1);
            return true;
        } else {
            System.out.println("Wrong potion to Wizard\n");
            return false;
        }
    }

    @Override
    public String action() {
        if (spell())
            return getUsername() + " spell with power " + spell + " [" + mana + " mana left]\n";
        else
            return getUsername() + " has no mana\n";
    }

    @Override
    public String toString() {
        return String.format("Wizard %s [%d level, %d health]\n", getUsername(), getLevel(), getHealth());
    }


}

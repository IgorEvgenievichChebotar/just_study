package ru.rutmiit2;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Hero extends Player implements Healthy, Armed, Inventory, Serializable, Comparable {
    @Serial
    private static final long serialVersionUID = 7302164851296642355L;
    private int health;
    private Weapon weapon;
    private List<Item> items = new ArrayList<>();
    private List<Clothes> clothes = new ArrayList<>();


    public Hero(String username, int level, int health) {
        super(username, level);
        setHealth(health);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public List<Item> getItems() {
        return this.items;
    }

    public List<Clothes> getClothes() {
        return this.clothes;
    }

    @Override
    public void recoverHealth(int number) {
        this.health += number;
    }

    @Override
    public boolean dress(Clothes clothes, int number) {
        if (this.clothes.size() < CLOTHES) {
            for (int i = 0; i < number; i++)
                this.clothes.add(clothes);
            System.out.println(getUsername() + " dress " + clothes);
            return true;
        } else {
            System.out.println("Not enough empty space");
            return false;
        }
    }

    @Override
    public boolean put(Item item, int number) {
        if (this.items.size() < ITEMS) {
            for (int i = 0; i < number; i++)
                this.items.add(item);
            System.out.println(getUsername() + " put " + item);
            return true;
        } else {
            System.out.println("Not enough empty space");
            return false;
        }
    }

    @Override
    public boolean change(Weapon weapon){
        if(this instanceof Elf){
            if(weapon instanceof Bow){
                this.weapon = weapon;
                return true;
            } else return false;
        }
        else if(this instanceof Knight){
            if(weapon instanceof Sword){
                this.weapon = weapon;
                return true;
            } else return false;
        }
        else if(this instanceof Wizard){
            if(weapon instanceof Staff){
                this.weapon = weapon;
                return true;
            } else return false;
        } else {
            return false;
        }
    }

    @Override
    public abstract boolean useItem(int number);

    @Override
    public abstract String action();

    @Override
    public int compareTo(Object o) {
        Hero h = (Hero) o;
        return Integer.compare(this.getLevel(), h.getLevel());
    }
}

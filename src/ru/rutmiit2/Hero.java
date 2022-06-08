package ru.rutmiit2;

import java.util.ArrayList;
import java.util.List;

public abstract class Hero extends Player implements Healthy, Armed, Inventory{
    protected int health;
    protected Weapon weapon;
    protected List<Item> items = new ArrayList<>();
    protected List<Clothes> clothes = new ArrayList<>();


    public Hero(String username, int level, int health) {
        super(username, level);
        setHealth(health);
    }

    private void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void getItems(){
        System.out.println(items.toString());
    }

    public void getClothes(){
        System.out.println(clothes.toString());
    }

    @Override
    public void recoverHealth(int number) {
        this.health+= number;
    }

    @Override
    public boolean dress(Clothes clothes, int number) {
        if (this.clothes.size() < CLOTHES) {
            for (int i = 0; i < number; i++)
                this.clothes.add(clothes);
            System.out.println(username + " dress " + clothes);
            return true;
        }
        else{
            System.out.println("Not enough empty space");
            return false;
        }
    }

    @Override
    public boolean put(Item item, int number) {
        if (this.items.size() < ITEMS){
            for (int i = 0; i < number; i++)
                this.items.add(item);
            System.out.println(username + " put " + item);
            return true;
        }
        else {
            System.out.println("Not enough empty space");
            return false;
        }
    }

    @Override
    public abstract boolean change(Weapon weapon);

    @Override
    public abstract boolean useItem(int number);

    @Override
    public abstract String action();
}

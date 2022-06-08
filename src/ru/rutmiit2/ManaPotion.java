package ru.rutmiit2;

public class ManaPotion extends Potions implements Thing {
    public ManaPotion(int count) {
        super(count);
    }

    @Override
    public String toString() {
        return "ManaPotion";
    }
}

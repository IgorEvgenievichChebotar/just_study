package ru.rutmiit2;

public class HealthPotion extends Potions implements Thing {
    public HealthPotion(int count) {
        super(count);
    }

    @Override
    public String toString() {
        return "HealthPotion";
    }
}

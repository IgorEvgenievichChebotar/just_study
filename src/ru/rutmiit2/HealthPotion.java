package ru.rutmiit2;

import java.io.Serial;

public class HealthPotion extends Potions implements Thing {
    @Serial
    private static final long serialVersionUID = 8713601722658747158L;

    public HealthPotion(int count) {
        super(count);
    }

    @Override
    public String toString() {
        return "HealthPotion";
    }
}

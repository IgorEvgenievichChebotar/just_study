package ru.rutmiit2;

import java.io.Serial;

public class ManaPotion extends Potions implements Thing {
    @Serial
    private static final long serialVersionUID = 431701016458816349L;

    public ManaPotion(int count) {
        super(count);
    }

    @Override
    public String toString() {
        return "ManaPotion";
    }
}

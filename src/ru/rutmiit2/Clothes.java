package ru.rutmiit2;

import java.io.Serial;

public abstract class Clothes implements Armor {
    @Serial
    private static final long serialVersionUID = -8481146433761134838L;
    int durability;

    public Clothes(int durability) {
        setDurability(durability);
    }

    private void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public int destroy(int number) {
        return 0;
    }

    @Override
    public boolean isBroken() {
        return false;
    }

    @Override
    public abstract String toString();
}

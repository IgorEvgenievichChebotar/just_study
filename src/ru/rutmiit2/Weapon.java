package ru.rutmiit2;

import java.io.Serial;

public abstract class Weapon implements Arming {
    @Serial
    private static final long serialVersionUID = 5700373416551019403L;
    private double ability;

    public Weapon(double ability) {
        setAbility(ability);
    }

    @Override
    public double getAbility() {
        return this.ability;
    }

    private void setAbility(double ability) {
        if (ability < 1 || ability > 5)
            throw new IllegalArgumentException("Incorrect ability number");
        this.ability = ability;
    }
}

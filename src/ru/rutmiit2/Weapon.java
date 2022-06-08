package ru.rutmiit2;

public abstract class Weapon implements Arming {
    private double ability;

    public Weapon(double ability) {
        setAbility(ability);
    }

    private void setAbility(double ability) {
        if(ability < 1 || ability > 5)
            throw new IllegalArgumentException("Incorrect ability number");
        this.ability = ability;
    }

    @Override
    public double getAbility() {
        return this.ability;
    }
}

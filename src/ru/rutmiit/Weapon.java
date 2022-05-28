package ru.rutmiit;

public abstract class Weapon implements Arming{
    protected double ability;

    public Weapon(double ability) {
        this.ability = ability;
    }

    private void setAbility(double ability) {
        this.ability = ability;
    }

    @Override
    public double getAbility() {
        return this.ability;
    }
}

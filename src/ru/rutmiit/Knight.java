package ru.rutmiit;

public class Knight extends Hero{

    private int strength;
    private int impactForce;

    public Knight(String username, int level, int strength, int impactForce) {
        super(username, level);
        setStrength(strength);
        setImpactForce(impactForce);
        System.out.println("Knight " + username + " lvl[" + level + "] is online");
    }

    private void setStrength(int strength) {
        if(strength < 1 || strength > 100)
            throw new IllegalArgumentException("Wrong value to knight’s strength");
        this.strength = strength;
    }

    private void setImpactForce(int impactForce) {
        if(impactForce<0 || impactForce>strength)
            throw new IllegalArgumentException("Wrong value to knight’s force impact");
        this.impactForce = impactForce;
    }

    public boolean fight() {
        if(strength-impactForce >= 0) {
            strength -= impactForce;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String action() {
        if(fight())
            return username + " fight with force " + impactForce + "\n";
        else
            return username + " has no more strength\n";
    }
}

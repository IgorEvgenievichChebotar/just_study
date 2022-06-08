package ru.rutmiit2;

public class Knight extends Hero{

    public int MAX_STRENGTH = 100;
    protected int strength;
    protected int force;

    public Knight(String username, int level, int health, int strength, int force) {
        super(username, level, health);
        setStrength(strength);
        setForce(force);
        super.weapon = new Sword(1);
        System.out.print(this);
    }

    private void setStrength(int strength) {
        if(strength < 1 || strength > MAX_STRENGTH)
            throw new IllegalArgumentException("Wrong value to knight’s strength");
        this.strength = strength;
    }

    private void setForce(int force) {
        if(force <0 || force > strength)
            throw new IllegalArgumentException("Wrong value to knight’s force impact");
        this.force = force;
    }

    private boolean fight() {
        if(strength- force >= 0) {
            strength -= force / weapon.getAbility();
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public boolean change(Weapon weapon) {
        if (weapon instanceof Sword) {
            this.weapon = weapon;
            this.force *= weapon.getAbility();
            System.out.println(username + " change weapon");
            return true;
        }
        else {
            System.out.println("Wrong weapon");
            return false;
        }
    }

    @Override
    public boolean useItem(int number) {
        if (number > items.size()) {
            System.out.println("Empty slot");
            return false;
        }
        Item item = this.items.get(number-1);
        if (item instanceof HealthPotion) {
            this.health += item.use();
            System.out.println(username + " use " + item);
            this.items.remove(number-1);
            return true;
        }
        else if (item instanceof Food){
            this.strength += item.use();
            System.out.println(username + " use " + item);
            this.items.remove(number-1);
            return true;
        }
        else{
            System.out.println("Wrong potion to Knight\n");
            return false;
        }
    }

    @Override
    public String action() {
        if(fight())
            return username + " fight with force " + force + " [" + strength + " strength left]\n";
        else
            return username + " has no more strength\n";
    }

    @Override
    public String toString() {
        return String.format("Knight %s [%d level, %d health] is online\n", username, level, health);
    }
}

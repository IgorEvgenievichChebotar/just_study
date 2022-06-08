package ru.rutmiit2;

public class Wizard extends Hero{

    public int MAX_MANA = 100;
    protected int mana;
    protected int spell;

    public Wizard(String username, int level, int health, int mana, int spell) {
        super(username, level, health);
        setMana(mana);
        setSpell(spell);
        super.weapon = new Staff(1);
        System.out.print(this);
    }

    private void setMana(int mana) {
        if(mana < 1 || mana > MAX_MANA)
            throw new IllegalArgumentException("Wrong value to wizard’s mana");
        this.mana = mana;
    }

    private void setSpell(int spell) {
        if(spell < 0 || spell >mana)
            throw new IllegalArgumentException("Wrong value to wizard’s spell power");
        this.spell = spell;
    }

    private boolean spell(){
        if(mana- spell >= 0) {
            mana -= spell / weapon.getAbility();
            return true;
        }
        else{
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
        else if (item instanceof ManaPotion){
            this.mana += item.use();
            System.out.println(username + " use " + item);
            this.items.remove(number-1);
            return true;
        }
        else{
            System.out.println("Wrong potion to Wizard\n");
            return false;
        }
    }

    @Override
    public boolean change(Weapon weapon) {
        if (weapon instanceof Staff) {
            this.weapon = weapon;
            this.spell *= weapon.getAbility();
            System.out.println(username + " change weapon");
            return true;
        }
        else {
            System.out.println("Wrong weapon");
            return false;
        }
    }

    @Override
    public String action(){
        if(spell())
            return username + " spell with power " + spell + " [" + mana + " mana left]\n";
        else
            return username + " has no mana\n";
    }

    @Override
    public String toString() {
        return String.format("Wizard %s [%d level, %d health] is online\n", username, level, health);
    }

}

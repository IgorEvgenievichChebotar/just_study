package ru.rutmiit;

public class Wizard extends Hero{
    private int mana;
    private  int spellPower;

    public Wizard(String username, int level, int mana, int spellPower) {
        super(username, level);
        setMana(mana);
        setSpellPower(spellPower);
        System.out.println("Wizard " + username + " lvl[" + level + "] is online");
    }

    private void setMana(int mana) {
        if(mana < 1 || mana > 100)
            throw new IllegalArgumentException("Wrong value to wizard’s mana");
        this.mana = mana;
    }

    private void setSpellPower(int spellPower) {
        if(spellPower < 0 || spellPower>mana)
            throw new IllegalArgumentException("Wrong value to wizard’s spell power");
        this.spellPower = spellPower;
    }

    private boolean spell(){
        if(mana-spellPower >= 0) {
            mana -= spellPower;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String action(){
        if(spell())
            return username + " spell with " + spellPower + " power\n";
        else
            return username + " has no mana\n";
    }

}

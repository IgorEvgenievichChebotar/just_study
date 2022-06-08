package ru.rutmiit2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hero> players = new ArrayList<>();
        Hero legolas = new Elf ("Legolas", 1, 70, 1);
        Hero arthur = new Knight ("Arthur", 35, 70, 100, 12);
        Hero merlin = new Wizard ("Merlin", 100, 70, 100, 80);

        legolas.put (new HealthPotion(5), 1);
        legolas.put (new HealthPotion(15), 1);
        legolas.put (new ManaPotion(10), 1);
        legolas.put (new Food(5), 1);

        legolas.dress(new Boots(3), 1);
        legolas.dress(new Dress(2), 1);
        legolas.dress(new Helmet(4), 1);

        legolas.useItem(1);
        legolas.useItem(6);

        System.out.print (legolas);

        arthur.change(new Sword (2.5));
        merlin.change(new Sword (2.5));

        legolas.getItems();
        legolas.getClothes();

        merlin.levelUp();

        players.add(legolas);
        players.add(arthur);
        players.add(merlin);

        for (Hero hero : players) {
            System.out.print(hero.action());
            System.out.print(hero.action());
        }
    }
}

package ru.rutmiit2;

public interface Armed {
    int CLOTHES = 3;
    boolean change(Weapon weapon);
    boolean dress(Clothes clothes, int number);
    String action();
}

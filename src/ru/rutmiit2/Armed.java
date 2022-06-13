package ru.rutmiit2;

import java.io.Serializable;

public interface Armed extends Serializable {
    int CLOTHES = 3;

    boolean change(Weapon weapon);

    boolean dress(Clothes clothes, int number);

    String action();
}

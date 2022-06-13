package ru.rutmiit2;

import java.io.Serializable;

public interface Armor extends Serializable {
    int destroy(int number);

    boolean isBroken();
}

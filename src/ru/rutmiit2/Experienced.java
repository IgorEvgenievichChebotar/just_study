package ru.rutmiit2;

import java.io.Serializable;

public interface Experienced extends Serializable {
    int getLevel();

    void levelUp();
}

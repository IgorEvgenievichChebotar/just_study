package ru.rutmiit2;

import java.io.Serializable;

public interface Healthy extends Serializable {
    int MAX_HEALTH = 100;

    int getHealth();

    void recoverHealth(int number);

}

package ru.rutmiit2;

import java.io.Serializable;

public interface Inventory extends Serializable {
    int ITEMS = 5;

    boolean put(Item item, int number);

    boolean useItem(int number);
}

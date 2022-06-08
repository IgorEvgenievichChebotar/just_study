package ru.rutmiit2;

public interface Inventory {
    int ITEMS = 5;
    boolean put(Item item, int number);
    boolean useItem(int number);
}

package ru.rutmiit2;

import java.io.Serial;

public class Food extends Item implements Thing {
    @Serial
    private static final long serialVersionUID = 8708687774986067364L;

    public Food(int count) {
        super(count);
    }

    @Override
    public String toString() {
        return "Food";
    }
}

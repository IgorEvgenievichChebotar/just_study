package ru.rutmiit2;

import java.io.Serial;

public abstract class Potions extends Item implements Thing {
    @Serial
    private static final long serialVersionUID = -1072959162576443944L;

    public Potions(int count) {
        super(count);
    }
}

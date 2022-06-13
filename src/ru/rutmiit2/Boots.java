package ru.rutmiit2;

import java.io.Serial;

public class Boots extends Clothes {
    @Serial
    private static final long serialVersionUID = 6260122614984810286L;

    public Boots(int durability) {
        super(durability);
    }

    @Override
    public String toString() {
        return "Boots";
    }
}

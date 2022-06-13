package ru.rutmiit2;

import java.io.Serial;

public class Dress extends Clothes {
    @Serial
    private static final long serialVersionUID = -3939187857209738629L;

    public Dress(int durability) {
        super(durability);
    }

    @Override
    public String toString() {
        return "Dress";
    }
}

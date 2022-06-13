package ru.rutmiit2;

import java.io.Serial;

public class Helmet extends Clothes {
    @Serial
    private static final long serialVersionUID = 9208388796955667346L;

    public Helmet(int durability) {
        super(durability);
    }

    @Override
    public String toString() {
        return "Helmet";
    }
}

package ru.rutmiit2;

import java.io.Serial;

public class Bow extends Weapon implements Arming {
    @Serial
    private static final long serialVersionUID = 3334360471474324998L;

    public Bow(double ability) {
        super(ability);
    }
}

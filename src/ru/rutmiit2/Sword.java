package ru.rutmiit2;

import java.io.Serial;

public class Sword extends Weapon implements Arming {

    @Serial
    private static final long serialVersionUID = 9211782872650626257L;

    public Sword(double ability) {
        super(ability);
    }
}

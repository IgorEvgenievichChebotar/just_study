package ru.rutmiit2;

import java.io.Serial;

public class Staff extends Weapon implements Arming {
    @Serial
    private static final long serialVersionUID = 6862793456403729871L;

    public Staff(double ability) {
        super(ability);
    }
}

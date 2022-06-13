package ru.rutmiit2;

import java.io.Serializable;

public interface Thing extends Serializable {
    int use();

    boolean isUsed();
}

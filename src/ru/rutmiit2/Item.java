package ru.rutmiit2;

import java.io.Serial;

public abstract class Item implements Thing {
    @Serial
    private static final long serialVersionUID = -7905489140732302519L;
    int count;

    public Item(int count) {
        setCount(count);
    }

    private void setCount(int count) {
        this.count = count;
    }

    @Override
    public int use() {
        return count;
    }

    @Override
    public boolean isUsed() {
        return false;
    }
}

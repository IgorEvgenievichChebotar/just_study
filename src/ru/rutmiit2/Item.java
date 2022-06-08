package ru.rutmiit2;

public abstract class Item implements Thing {
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

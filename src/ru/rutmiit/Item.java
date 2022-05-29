package ru.rutmiit;

public class Item implements Thing{
    int count;

    public Item(int count) {
        setCount(count);
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int use() {
        return 0;
    }

    @Override
    public boolean isUsed() {
        return false;
    }
}

package ru.rutmiit2;

public class Food extends Item implements Thing {
    public Food(int count) {
        super(count);
    }
    @Override
    public String toString() {
        return "Food";
    }
}

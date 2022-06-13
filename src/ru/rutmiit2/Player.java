package ru.rutmiit2;

import java.io.Serial;

public abstract class Player implements Experienced, Identifiable {

    @Serial
    private static final long serialVersionUID = 6765002358237513550L;
    private String username;
    private int level;

    public Player(String username, int level) {
        setUsername(username);
        setLevel(level);
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void levelUp() {
        System.out.println(username + " level up");
        this.level += 1;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    protected void setUsername(String username) {
        this.username = username;
    }
}

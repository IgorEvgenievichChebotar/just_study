package ru.rutmiit;

abstract class Hero {
    protected String username;
    protected int level;

    public Hero(String username, int level) {
        setUsername(username);
        setLevel(level);
    }

    protected void setUsername(String username) {
        if(username.length() < 5)
            throw new IllegalArgumentException("Wrong value to hero’s username");
        this.username = username;
    }

    protected void setLevel(int level) {
        if(level < 0)
            throw new IllegalArgumentException("Wrong value to hero’s level");
        this.level = level;
    }

    public abstract String action();
}

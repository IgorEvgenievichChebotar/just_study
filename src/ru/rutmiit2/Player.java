package ru.rutmiit2;

public abstract class Player implements Experienced, Identifiable{

    protected String username;
    protected int level;

    public Player(String username, int level) {
        setUsername(username);
        setLevel(level);
    }

    private void setUsername(String username) {
        this.username = username;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public void levelUp() {
        System.out.println(username + " level up");
        this.level+=1;
    }

    @Override
    public String getUsername() {
        return this.username;
    }
}

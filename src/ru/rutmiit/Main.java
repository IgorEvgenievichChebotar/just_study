package ru.rutmiit;

public class Main {
    public static void main (String[] args) {

        Auth user1 = new Auth();

        user1.reg();

        if (user1.log())
            System.out.println("Вход выполнен");
        else
            System.out.println("Пользователь не найден");

    }
}

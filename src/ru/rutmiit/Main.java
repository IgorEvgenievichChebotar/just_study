package ru.rutmiit;

public class Main {
    public static void main (String[] args) {

        Auth program1 = new Auth();

        program1.reg();
        if (program1.log())
            System.out.println("Вход выполнен");
        else
            System.out.println("Пользователь не найден");

    }
}

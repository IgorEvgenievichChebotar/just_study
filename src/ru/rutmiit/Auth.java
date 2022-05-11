package ru.rutmiit;

import java.util.Scanner;

public class Auth {

    String username_;
    String password_;

    void reg(){
        Scanner scanner = new Scanner(System.in);
        username_ = scanner.nextLine();
        password_ = scanner.nextLine();
    }

    boolean log(){
        return username_.equals("Barsik1337228") && password_.equals("qwerty");
    }
}


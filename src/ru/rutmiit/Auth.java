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
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        return username.equals(username_) && password.equals(password_);
    }
}


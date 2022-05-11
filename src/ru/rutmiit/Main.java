package ru.rutmiit;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        boolean IsValid = (num>0 && num<10);
        if (IsValid){
            System.out.println("Valid");
        }
        if (!IsValid){
            System.out.println("Invalid");
        }

    }
}
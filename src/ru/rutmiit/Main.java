package ru.rutmiit;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String lastName = scanner.nextLine();
        int group = Integer.parseInt(scanner.nextLine());
        String str = ("Привет " + name + " " + lastName + " из " + group + " группы ");
        System.out.println(str.toUpperCase());
        System.out.printf("Привет %s %s из %d группы\n", name, lastName, group);

        float length = Float.parseFloat(scanner.nextLine());
        float square = length * length;
        System.out.println(square);
        System.out.println(Math.ceil(square));
        System.out.println(Math.floor(square));
        System.out.println(Math.round(square));

        double inch = Double.parseDouble(scanner.nextLine());
        double cm = inch * 2.54;
        System.out.printf("%.2f\n", cm);

    }
}
package ru.rutmiit;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mark = Integer.parseInt(scanner.nextLine());
        if (mark == 5) {
            System.out.println("Отлично");
        } else if (mark == 4) {
            System.out.println("Хорошо");
        } else if (mark == 3) {
            System.out.println("Удовлетворительно");
        } else if (mark == 2) {
            System.out.println("Плохо");
        } else {
            System.out.println("Не оценка");
        }

        int day = Integer.parseInt(scanner.nextLine());
        switch (day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Не день недели");
        }

    }
}
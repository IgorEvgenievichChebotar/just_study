package ru.rutmiit;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Chicken chicken = new Chicken("Maria", 10);

        System.out.println(
                "Chicken " + chicken.getName() + " (age "+ chicken.getAge() +") can produce " + chicken.productPerDay() + " eggs per day."
        );

    }
}
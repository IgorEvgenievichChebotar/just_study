package ru.rutmiit;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void process_actions(Hero hero){
        boolean exec = true;
        while(exec){
            String[] commands_arr = sc.nextLine().split(" ");
            switch (commands_arr[0]) {
                case "Action", "action" -> System.out.print(hero.action());
                case "End", "end" -> exec = false;
            }
        }
    }
    public static void main(String[] args) {
        boolean exec = true;
        while(exec){
            String[] str_arr = sc.nextLine().split(" ");
            switch (str_arr[0]) {
                case "Wizard", "wizard" -> {
                    Wizard wizard = new Wizard(
                            str_arr[1],
                            Integer.parseInt(str_arr[2]),
                            Integer.parseInt(str_arr[3]),
                            Integer.parseInt(str_arr[4])
                    );
                    process_actions(wizard);
                    System.out.print("Continue create hero`s? true/false");
                    exec = Boolean.parseBoolean(sc.nextLine());
                }
                case "Elf", "elf" -> {
                    Elf elf = new Elf(
                            str_arr[1],
                            Integer.parseInt(str_arr[2]),
                            Integer.parseInt(str_arr[3])
                    );
                    process_actions(elf);
                    System.out.println("Continue create hero`s? true/false");
                    exec = Boolean.parseBoolean(sc.nextLine());
                }
                case "Knight", "knight" -> {
                    Knight knight = new Knight(
                            str_arr[1],
                            Integer.parseInt(str_arr[2]),
                            Integer.parseInt(str_arr[3]),
                            Integer.parseInt(str_arr[4])
                    );
                    process_actions(knight);
                    System.out.println("Continue create hero`s? true/false");
                    exec = Boolean.parseBoolean(sc.nextLine());
                }
                default -> throw new IllegalStateException("Unexpected value: " + str_arr[0]);
            }
        }
    }
}
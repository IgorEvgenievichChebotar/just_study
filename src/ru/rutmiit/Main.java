package ru.rutmiit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String path = String.valueOf(Paths.get("heroes.txt").toAbsolutePath());

        System.out.println("¬ведите название файла в корне проекта: ");
        String file_name = sc.nextLine();
        System.out.println("¬ведите что нужно записать в файл: ");
        String text = sc.nextLine();

        try {
            writeToFile(file_name, text);
            System.out.println(readFromFile(file_name));
        } catch (FileNotFoundException e) {
            System.out.println("‘айл не найден");
        }
    }

    private static int sum(String content) {
        int result = 0;
        int[] arr = Arrays
                .stream(content.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int elem : arr)
            result += elem;
        return result;
    }

    public static String readFromFile(String file_name) throws FileNotFoundException {
        File file = new File(file_name);
        Scanner sc = new Scanner(file);
        StringBuilder content = new StringBuilder();
        while (sc.hasNextLine())
            content.append(sc.nextLine());
        return content.toString();
    }

    public static void writeToFile(String file_name, String text) throws FileNotFoundException{
        File file = new File(file_name);
        PrintWriter pw = new PrintWriter(file);
        pw.println(text);
        pw.close();
    }

}
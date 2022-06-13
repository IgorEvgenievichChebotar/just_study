package ru.rutmiit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {

    public static String read(String path) throws FileNotFoundException {
        File file = new File(String.valueOf(path));

        Scanner sc = new Scanner(file);

        StringBuilder content = new StringBuilder();

        while (sc.hasNextLine())
            content.append(sc.nextLine()).append("\n");

        return content.toString();
    }
}

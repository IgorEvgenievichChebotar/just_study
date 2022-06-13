package ru.rutmiit2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveAndUploadHeroes {
    public static void save(List<Hero> heroes, String file_name) throws IOException {
        clearTheFile(file_name);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file_name))) {

            for (Hero hero : heroes) {
                oos.writeObject(hero);
            }
        }
    }

    public static List<Hero> upload(String source_file_name){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(source_file_name))) {
            List<Hero> heroes = new ArrayList<>();
            while (true) {
                try {
                    heroes.add((Hero) ois.readObject());
                } catch (IOException | ClassNotFoundException e) {
                    break;
                }
            }
            return heroes;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void clearTheFile(String source_file_name) {
        try {
            FileWriter fwOb = new FileWriter(source_file_name, false);
            PrintWriter pwOb = new PrintWriter(fwOb, false);
            pwOb.flush();
            pwOb.close();
            fwOb.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

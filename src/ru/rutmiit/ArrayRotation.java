package ru.rutmiit;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayRotation {
    private List<String> list = new ArrayList<>();

    public void fill() {
        Scanner sc = new Scanner(System.in);
        list = Arrays
                .stream(sc.nextLine().split(" "))
                .collect(Collectors.toList());
    }

    public void rotate(int distance) {
        Collections.rotate(list, distance);
    }

    public void view() {
        for (String elem : list) {
            System.out.println(elem);
        }
    }
}

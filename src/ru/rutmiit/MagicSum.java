package ru.rutmiit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MagicSum {

    private List<Integer> numbers = new ArrayList<>();

    public void find_pairs() {
        Scanner sc = new Scanner(System.in);

        numbers = Arrays
                .stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int magic_num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i; j < numbers.size(); j++) {
                if (numbers.get(i) + numbers.get(j) == magic_num) {
                    System.out.printf("%d + %d", numbers.get(i), numbers.get(j));
                    System.out.println();
                }
            }

        }
    }
}
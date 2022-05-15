package ru.rutmiit;

import java.util.*;
import java.util.stream.Collectors;

public class BigNumbers {
    private List<Integer> numbers = new ArrayList<>();

    public void find_big_upper_num() {
        Scanner sc = new Scanner(System.in);

        numbers = Arrays
                .stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int biggest = 0;
        int biggest_last = 0;
        for (int i = 0; i < numbers.size(); i++) {
            biggest_last = biggest;
            biggest = 0;
            for (int j = i; j < numbers.size(); j++) {
                if(numbers.get(j) > biggest)
                    biggest = numbers.get(j);
            }
            if(biggest != biggest_last)
                System.out.println(biggest);
        }
    }

    public void view() {
        for (int number : numbers) {
            System.out.printf("%s ", number);
        }
        System.out.println();
    }
}
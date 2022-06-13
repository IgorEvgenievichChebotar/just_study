package ru.rutmiit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {

    private final List<Integer> wagons = new ArrayList<>();

    public void fill() {
        Scanner sc = new Scanner(System.in);

        int wagons_num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < wagons_num; i++) {
            int pass_num = Integer.parseInt(sc.nextLine());
            wagons.add(pass_num);
        }
    }

    public void view() {
        for (int wagon : wagons) {
            System.out.printf("%d ", wagon);
        }
        System.out.println();

        int sum = 0;
        for (int wagon : wagons) {
            sum += wagon;
        }
        System.out.println(sum);
    }
}

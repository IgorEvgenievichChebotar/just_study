package ru.rutmiit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Polygon> figures = new ArrayList<>();

            boolean exec = true;
            boolean isParallel = true;
            int[] sides_arr;
            while(exec){
                try{
                sides_arr = Arrays
                        .stream(sc.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();

                if (sides_arr.length == 1) {
                    figures.add(new Circle(sides_arr));
                }
                else if (sides_arr.length == 3) {
                    figures.add(new Triangle(sides_arr));
                }
                else if (sides_arr.length == 4) {
                    if(Arrays.stream(sides_arr).distinct().count() == sides_arr[0])
                        figures.add(new Rhombus(sides_arr));
                    else
                        if(isParallel)
                            figures.add(new Parallelogram(sides_arr));
                        else
                            figures.add(new Quadrilateral(sides_arr));
                } else if (sides_arr.length > 4) {
                    figures.add(new Polygon(sides_arr));
                }
                else
                    new Polygon(sides_arr);
                System.out.println("Continue creating objects? true/false");
                exec = Boolean.parseBoolean(sc.nextLine());
                }
                catch(Exception e){
                    System.out.println(e.getMessage());
                }
        }

        for(Polygon figure : figures){
            System.out.println(figure);
            System.out.println();
        }
    }
}
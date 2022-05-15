package ru.rutmiit;

import java.util.Scanner;

public class CommonElements {

    private String[] array;

    public void fill(String str){
        array = str.split(" ");
    }

    public void fill(){
        Scanner sc = new Scanner(System.in);
        array = sc.nextLine().split(" ");
    }

    public void find_common_elements(CommonElements array){
        for(String elem1 : array.array){
            for(String elem2 : this.array){
                if (elem1.equals(elem2)){
                    System.out.printf("%s ", elem1);
                }
            }
        }
        System.out.println();
    }

    public void find_common_elements(String str){
        array = str.split(" ");
        for(String elem1 : array){
            for(String elem2 : this.array){
                if (elem1.equals(elem2)){
                    System.out.printf("%s ", elem1);
                }
            }
        }
        System.out.println();
    }

}

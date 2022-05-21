package ru.rutmiit;

import java.util.Arrays;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 15) {
            throw new IllegalArgumentException("Курицы столько не живут");
        }
        if (age < 0){
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
    }

    private double calculateProductPerDay(){
        if(this.age > 0 && this.age <= 6){
            return 2;
        }
        if(this.age > 6 && this.age <= 12){
            return 1;
        }
        if(this.age > 12 && this.age <= 15){
            return 0.75;
        }
        else {return 0;}
    }

    public String productPerDay(){
        return String.valueOf(calculateProductPerDay());
    }
}

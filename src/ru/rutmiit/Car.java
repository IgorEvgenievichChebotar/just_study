package ru.rutmiit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Car {
    private String make;
    private String model;
    private Integer horsePower;

    public Car(String make) {
        this.make = make;
        this.model = "Unknown";
        this.horsePower = -1;
    }
    public Car(String make, String model, Integer horsePower) {
        this.make = make;
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void getInfo(){
        System.out.printf("The car is: %s %s – %d HP.", this.make, this.model, this.horsePower);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Car> cars_list = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        System.out.println();
        for(int i = 0; i < n; i++){
            String[] arr = sc.nextLine().split(" ");
            System.out.println();
            Car car = new Car(arr[0], arr[1], Integer.parseInt(arr[2]));
            cars_list.add(car);
        }

        for(Car car : cars_list){
            car.getInfo();
        }
    }


}

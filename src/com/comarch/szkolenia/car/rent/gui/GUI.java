package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.model.Car;

import java.util.Scanner;

public class GUI {
    private final static Scanner scanner = new Scanner(System.in);

    /*static {
        System.out.println("cos !!");
    }*/

    public static String showMenuAndReadChoose() {
        System.out.println("1. List cars");
        System.out.println("2. Rent car");
        System.out.println("3. Exit");

        return scanner.nextLine();
    }

    public static void showCars(Car[] cars) {
        for(Car car : cars) {
            System.out.println(
                    new StringBuilder()
                    .append(car.getBrand())
                    .append(" ")
                    .append(car.getModel())
                    .append(" Year: ")
                    .append(car.getYear())
                    .append(" Price: ")
                    .append(car.getPrice())
                    .append("zl Plate: ")
                    .append(car.getPlate())
                    .append(car.isRent() ? " Not available" : " Available")
            );


            /*System.out.println(
                    car.getBrand() + " " +
                            car.getModel() +
                            " Year: " + car.getYear() +
                            " Price: " + car.getPrice() +
                            " Plate: " + car.getPlate() +
                            " Rent: " + car.isRent());*/
        }
    }

    public static String readPlate() {
        System.out.println("Enter plate:");
        return scanner.nextLine();
    }

    public static void showResult(boolean result) {
        System.out.println(result ? "Success !!" : "Error !!");

        /*if(result) {
            System.out.println("Success !!");
        } else {
            System.out.println("Error !!");
        }*/
    }

    public static void showWrongChoose() {
        System.out.println("Wrong choose !! Pick again !!");
    }
}

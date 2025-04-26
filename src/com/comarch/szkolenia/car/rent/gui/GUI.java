package com.comarch.szkolenia.car.rent.gui;

import com.comarch.szkolenia.car.rent.model.Bus;
import com.comarch.szkolenia.car.rent.model.Vehicle;

import java.util.Scanner;

public class GUI {
    private final static Scanner scanner = new Scanner(System.in);

    public static String showMenuAndReadChoose() {
        System.out.println("1. List vehicles");
        System.out.println("2. Rent vehicle");
        System.out.println("3. Exit");

        return scanner.nextLine();
    }

    public static void showVehicles(Vehicle[] vehicles) {
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    public static String readPlate() {
        System.out.println("Enter plate:");
        return scanner.nextLine();
    }

    public static void showResult(boolean result) {
        System.out.println(result ? "Success !!" : "Error !!");
    }

    public static void showWrongChoose() {
        System.out.println("Wrong choose !! Pick again !!");
    }
}

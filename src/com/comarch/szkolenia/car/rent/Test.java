package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.model.Car;

public class Test {
    public static void main(String[] args) {
        final int x = 8;

        //x = 7;

        final double LICZBA_PI = 3.1461;

        System.out.println(x);

        double y = 4 * LICZBA_PI;
        double z = 12 + 5 * LICZBA_PI;

        final Car car = new Car();

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getPrice());

        car.setBrand("BMW");
        car.setModel("3");
        car.setYear(2020);
        car.setPrice(400.0);

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        System.out.println(car.getPrice());

        //car = null;
    }
}

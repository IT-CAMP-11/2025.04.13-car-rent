package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.gui.GUI;
import com.comarch.szkolenia.car.rent.model.Car;
import com.comarch.szkolenia.car.rent.model.CarBuilder;

public class BuilderTest {
    public static void main(String[] args) {
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.brand("Toyota");
        //
        //
        //
        //
        //
        carBuilder.model("Corolla");
        //
        //
        //
        //
        //
        carBuilder.plate("KR11").rent(true);
        //
        //
        //
        //
        //
        carBuilder.year(2020).price(300.00);

        Car car = carBuilder.build();

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getPrice());
        System.out.println(car.getYear());
    }
}

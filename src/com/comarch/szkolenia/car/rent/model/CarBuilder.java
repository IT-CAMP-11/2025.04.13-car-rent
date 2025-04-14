package com.comarch.szkolenia.car.rent.model;

public class CarBuilder {
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean rent;
    private String plate;

    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder year(int year) {
        this.year = year;
        return this;
    }

    public CarBuilder price(double price) {
        this.price = price;
        return this;
    }

    public CarBuilder rent(boolean rent) {
        this.rent = rent;
        return this;
    }

    public CarBuilder plate(String plate) {
        this.plate = plate;
        return this;
    }

    public Car build() {
        return new Car(this.brand, this.model, this.year, this.price, this.rent, this.plate);
    }
}

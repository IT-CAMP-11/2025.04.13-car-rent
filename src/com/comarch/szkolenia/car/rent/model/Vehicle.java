package com.comarch.szkolenia.car.rent.model;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private double price;
    private boolean rent;
    private String plate;

    public Vehicle(String brand, String model, int year, double price, boolean rent, String plate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.rent = rent;
        this.plate = plate;
    }

    public Vehicle(String brand, String model, int year, double price, String plate) {
        this(brand, model, year, price, false, plate);
    }

    public Vehicle() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(this.getBrand())
                .append(" ")
                .append(this.getModel())
                .append(" Year: ")
                .append(this.getYear())
                .append(" Price: ")
                .append(this.getPrice())
                .append("zl Plate: ")
                .append(this.getPlate())
                .append(this.isRent() ? " Not available" : " Available")
                .toString();
    }
}

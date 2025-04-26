package com.comarch.szkolenia.car.rent.model;

public class Bus extends Vehicle {
    private int seats;

    public Bus(String brand, String model, int year, double price, boolean rent, String plate, int seats) {
        super(brand, model, year, price, rent, plate);
        this.seats = seats;
    }

    public Bus(String brand, String model, int year, double price, String plate, int seats) {
        super(brand, model, year, price, plate);
        this.seats = seats;
    }

    public Bus() {
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return super.toString() + " Seats: " + this.seats;
    }
}
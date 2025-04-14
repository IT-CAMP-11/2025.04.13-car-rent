package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Car;

public class CarRepository {
    private final Car[] cars;

    public CarRepository() {
        this.cars = new Car[5];
        this.cars[0] = new Car("Toyota", "Corolla", 2020, 300.00, "KR1");
        this.cars[1] = new Car("Kia", "Ceed", 2021, 320.00, "KR2");
        this.cars[2] = new Car("BMW", "3", 2019, 350.00, "KR3");
        this.cars[3] = new Car("Fiat", "Panda", 2015, 100.00, "KR4");
        this.cars[4] = new Car("Honda", "Civic", 2022, 400.00, "KR5");
    }

    public boolean rentCar(String plate) {
        for(Car car : this.cars) {
            if(car.getPlate().equals(plate) && !car.isRent()) {
                car.setRent(true);
                return true;
            }
        }

        return false;
    }

    public Car[] getCars() {
        return this.cars;
    }
}

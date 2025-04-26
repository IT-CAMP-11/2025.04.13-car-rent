package com.comarch.szkolenia.car.rent.database;

import com.comarch.szkolenia.car.rent.model.Bus;
import com.comarch.szkolenia.car.rent.model.Car;
import com.comarch.szkolenia.car.rent.model.Motorcycle;
import com.comarch.szkolenia.car.rent.model.Vehicle;

public class VehicleRepository {
    private final Vehicle[] vehicles;

    public VehicleRepository() {
        this.vehicles = new Vehicle[9];
        this.vehicles[0] = new Car("Toyota", "Corolla", 2020, 300.00, "KR1");
        this.vehicles[1] = new Car("Kia", "Ceed", 2021, 320.00, "KR2");
        this.vehicles[2] = new Car("BMW", "3", 2019, 350.00, "KR3");
        this.vehicles[3] = new Car("Fiat", "Panda", 2015, 100.00, "KR4");
        this.vehicles[4] = new Car("Honda", "Civic", 2022, 400.00, "KR5");
        this.vehicles[5] = new Bus("Mercedess", "1000", 2000, 500.0, "KR66", 50);
        this.vehicles[6] = new Bus("Urbino", "2000", 2015, 700.00, "KR77", 55);
        this.vehicles[7] = new Bus("Mercedess", "2000", 2020, 900.00, "KR88", 62);
        this.vehicles[8] = new Motorcycle("Honda", "Jakas", 2020, 200.00, "KR999", true);
    }

    public boolean rentVehicle(String plate) {
        for(Vehicle vehicle : this.vehicles) {
            if(vehicle.getPlate().equals(plate) && !vehicle.isRent()) {
                vehicle.setRent(true);
                return true;
            }
        }

        return false;
    }

    public Vehicle[] getVehicles() {
        return this.vehicles;
    }
}

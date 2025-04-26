package com.comarch.szkolenia.car.rent;

import com.comarch.szkolenia.car.rent.database.VehicleRepository;
import com.comarch.szkolenia.car.rent.gui.GUI;

public class App {
    public static void main(String[] args) {
        final VehicleRepository vehicleRepository = new VehicleRepository();
        boolean run = true;
        while(run) {
            switch(GUI.showMenuAndReadChoose()) {
                case "1":
                    GUI.showVehicles(vehicleRepository.getVehicles());
                    break;
                case "2":
                    GUI.showResult(vehicleRepository.rentVehicle(GUI.readPlate()));
                    break;
                case "3":
                    run = false;
                    break;
                default:
                    GUI.showWrongChoose();
                    break;
            }
        }
    }
}

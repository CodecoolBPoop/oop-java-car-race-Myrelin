package com.codecool.car_race;

import java.util.ArrayList;
import java.util.List;

import com.codecool.car_race.Vehicles.Vehicle;
import com.codecool.car_race.Vehicles.Car;
import com.codecool.car_race.Vehicles.Motorcycle;
import com.codecool.car_race.Vehicles.Truck;

public class Race {

    static final int RACE_DURATION = 50;

/*    private boolean TruckBrokenDown;

    public boolean isTruckBrokenDown() {
        return TruckBrokenDown;
    }*/

    private final List<Vehicle> vehicles = new ArrayList<>();

    public void qualifyDriver(Vehicle driver) {
        vehicles.add(driver);
    }

    public void simulateRace() {
        for (int i = 0; i < RACE_DURATION; i++) {
            for (Vehicle vehicle : vehicles) {
                vehicle.raceDirectionReport(this);
                vehicle.raceDistance();
            }

        }
    }

}
package com.codecool.car_race.Vehicles;

import com.codecool.car_race.Race;

public class Truck extends Vehicle {

    public Truck(int normalSpeed) {
        super( normalSpeed );
    }

    @Override
    protected String generateName() {
        return null;
    }

    @Override
    public void raceDirectionReport(Race race) {
        currentSpeed = normalSpeed;
    }
}

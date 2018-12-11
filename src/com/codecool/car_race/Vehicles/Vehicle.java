package com.codecool.car_race.Vehicles;

import com.codecool.car_race.Race;

public abstract class Vehicle {

    protected abstract String generateName();

    protected final String vehicleName;

    protected final int idealSpeed;

    protected int currentSpeed;

    protected Vehicle (int idealSpeed) {
        this.vehicleName = generateName();
        this.idealSpeed = idealSpeed;
    }
    //conditions lap to lap
    public abstract void raceDirectionReport(Race race);
    //cumulates over the course of the 50 hours
    protected int completedDistance;
    public final void raceDistance() {
        completedDistance += currentSpeed;
    }


}

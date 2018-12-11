package com.codecool.car_race.Vehicles;

import com.codecool.car_race.Race;

public class Motorcycle extends Vehicle {

    private static final int[] GP_NUMBERS = {
            1,
            27,
            46,
            69,
            93,
            99,
            4,
            25,
            26,
            29
    };

    private static final int IDEAL_SPEED = 100;
    protected static final int YELLOW_FLAG_SPEED = 75;

    public Motorcycle() {

        super(IDEAL_SPEED);
    }

    @Override
    protected String generateName() {
        int i = 0;
        return "Motorcycle: " + GP_NUMBERS[i++];
    }
    @Override
    public void raceDirectionReport(Race race) {
        //yellow flag speed if truck messed up
        currentSpeed = idealSpeed;
    }
}

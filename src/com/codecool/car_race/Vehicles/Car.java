package com.codecool.car_race.Vehicles;

import com.codecool.car_race.Race;

public class Car extends Vehicle {
    // All the important names.
    private static final String[] CAR_NAMES = {
            "Julie",
            "Kate",
            "Kate's Dirty Sister",
            "Luscious Liz",
            "Kinky Kylie",
            "Abbey",
            "Hungry Heidi",
            "Suzie",
            "Eva",
            "Margherita",
            "Gina",
            "Loria"
    };

    protected static final int IDEAL_SPEED = 110;
    protected static final int VIRTUAL_SAFETY_CAR_SPEED = 75;

    public Car() {
        super(IDEAL_SPEED);
    }

    //random pick from list?
    @Override
    protected String generateName() {
        int i = 0;
     return "Car: " + CAR_NAMES[i++];
    }

    @Override
    public void raceDirectionReport(Race race) {
        //yellow flag speed if truck messed up
        currentSpeed = idealSpeed;
    }

}


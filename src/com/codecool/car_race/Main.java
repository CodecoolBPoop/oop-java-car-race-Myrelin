package com.codecool.car_race;

import com.codecool.car_race.Vehicles.Car;
import com.codecool.car_race.Vehicles.Motorcycle;
import com.codecool.car_race.Vehicles.Truck;
import com.codecool.car_race.Vehicles.Vehicle;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {
        for (int i = 0; i < 10; i++) {
            race.qualifyDriver( new Car() );
            race.qualifyDriver( new Motorcycle() );
            //race.qualifyDriver(new Truck());
        }

        /**
         * Entry point of our program. Creates one race instance and
         * uses that.
         *
         *
         * @param args commandline arguments passed to the program.
         *             It is unused.
         */
        public static void main(String[] args) {
            Race race = new Race();
            createVehicles(race);

            race.simulateRace();
            //race.raceResults();
        }
    }
}

package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;

public class TollCalculator {
    public static void main(String[] args) {

        Car carNoTrailer = new Car(false);
        Car carWithTrailer = new Car(true);
        Tank tank = new Tank();
        Truck truck4Axles = new Truck(4);
        Truck truck6Axles = new Truck(6);
        Truck truck8Axles = new Truck(8);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(carNoTrailer);
        vehicles.add(carWithTrailer);
        vehicles.add(tank);
        vehicles.add(truck4Axles);
        vehicles.add(truck6Axles);
        vehicles.add(truck8Axles);


        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.printf("%-20s %-20s %-6s", "Vehicle", "Distance Traveled", "Toll $\n");
        System.out.println("_________________________________________________________");

        for (Vehicle vehicle : vehicles) {

            String vehicleOutput = "";
            if (vehicle == carNoTrailer) {
                vehicleOutput = "Car";
            } else if (vehicle == carWithTrailer) {
                vehicleOutput = "Car (with trailer)";
            } else if (vehicle == tank) {
                vehicleOutput = "Tank";
            } else if (vehicle == truck4Axles) {
                vehicleOutput = "Truck (4 axles)";
            } else if (vehicle == truck6Axles) {
                vehicleOutput = "Truck (6 axles)";
            } else if (vehicle == truck8Axles) {
                vehicleOutput = "Truck (8 axles)";
            }

            int distance = (int) (Math.random() * (240 - 10 + 1) + 10);


            System.out.printf("%-20s %-20s %-6s %n",vehicleOutput,distance,currency.format(vehicle.calculateToll(distance)));

        }

    }
}

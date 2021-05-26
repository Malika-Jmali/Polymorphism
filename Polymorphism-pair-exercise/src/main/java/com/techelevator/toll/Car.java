package com.techelevator.toll;

public class Car implements Vehicle {

private boolean hasTrailer;

    public Car(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    public boolean isHasTrailer() {

        return hasTrailer;
    }

    @Override
    public double calculateToll(int distance) {



        if (hasTrailer) {
            return distance*0.020 + 1;
        }
        else {
            return distance*0.020;
        }
    }
}

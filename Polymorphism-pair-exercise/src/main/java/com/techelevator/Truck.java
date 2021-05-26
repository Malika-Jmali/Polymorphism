package com.techelevator;

public class Truck implements Vehicle {

    private int numberOfAxles;

    public Truck(int numberOfAxles) {
        this.numberOfAxles = numberOfAxles;
    }

    public int getNumberOfAxles() {

        return numberOfAxles;
    }

    @Override
    public double calculateToll(int distance){
       if(numberOfAxles>=8) {
           return distance * 0.048;
       }
       else if (numberOfAxles == 6){
           return distance * 0.045;
       }
       else if (numberOfAxles == 4){
           return distance * 0.040;
       }
       return 0;
    }
}

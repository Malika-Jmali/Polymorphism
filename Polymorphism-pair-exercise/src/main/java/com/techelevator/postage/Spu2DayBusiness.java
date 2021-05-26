package com.techelevator.postage;

public class Spu2DayBusiness implements DeliveryDriver{
    @Override
    public double calculateRate(int distance, double weight) {
        return((weight/16)*0.050*distance);
    }
}

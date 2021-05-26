package com.techelevator.postage;

public class PostalService2 implements DeliveryDriver{
    @Override
    public double calculateRate(int distance, double weight) {
        double perMileRate=0;

        if(weight>=0 && weight<=2){
            perMileRate=0.0035;
        } else if (weight>=3 && weight<=8){
            perMileRate= 0.0040;
        }else if (weight>=9 && weight<=15) {
            perMileRate = 0.0047;
        }else if (weight>=16 && weight<=48) {
            perMileRate = 0.0195;
        }else if (weight>=49&& weight<=128) {
            perMileRate = 0.0450;
        }else if (weight>128) {
            perMileRate = 0.0500;
        }
        return perMileRate * distance;

    }
}

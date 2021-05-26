package postage;

public class PostalService3 implements DeliveryDriver{
    @Override
    public double calculateRate(int distance, double weight) {
        double perMileRate = 0;

        if (weight >= 0 && weight <= 2) {
            perMileRate = 0.0020;
        } else if (weight >= 3 && weight <= 8) {
            perMileRate = 0.0022;
        } else if (weight >= 9 && weight <= 15) {
            perMileRate = 0.0024;
        } else if (weight >= 16 && weight <= 48) {
            perMileRate = 0.0150;
        } else if (weight >= 49 && weight <= 128) {
            perMileRate = 0.0160;
        } else if (weight > 128) {
            perMileRate = 0.0170;
        }
        return perMileRate * distance;

    }
    }


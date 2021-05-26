package postage;

public class Spu4DayGround implements DeliveryDriver{
    @Override
    public double calculateRate(int distance, double weight) {
        return((weight/16)*0.0050*distance);
    }
}

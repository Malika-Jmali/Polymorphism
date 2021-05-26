package postage;

public class SpuNextDay implements DeliveryDriver{
    @Override
    public double calculateRate(int distance, double weight) {
        return((weight/16)*0.075*distance);
    }
}

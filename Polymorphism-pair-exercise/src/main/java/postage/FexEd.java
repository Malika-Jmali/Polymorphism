package postage;

public class FexEd implements DeliveryDriver {
    @Override
    public double calculateRate(int distance, double weight) {
        if (distance<=500 && weight <=48){
            return 20.00;
        }else if(distance>500 && weight>48){
            return 28;
        }else if(distance>500 && weight<=48){
            return 25;
        }else if(distance<=500 &&weight>48){
            return 23;
        }
        return 0;

    }
}

package Composite;
import java.util.ArrayList;
import java.util.List;

public class Box implements Delivery{
    List<Delivery> deliveries = new ArrayList<>();
    public Box(List<Delivery> deliveries) {
            this.deliveries = deliveries;
    }
    public void setDelivery(Delivery dl){
        this.deliveries.add(dl);
    }
    @Override
    public int getPrice() {
        int sum=0;
        for(Delivery delivery : deliveries){
            sum+=delivery.getPrice();
        }
        return sum;
    }
}

package Composite;

public class Product implements Delivery {
    int price;
    String name;
    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }
    @Override
    public int getPrice() {
        return price;
    }

}

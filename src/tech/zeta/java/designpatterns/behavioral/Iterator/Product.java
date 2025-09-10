package tech.zeta.java.designpatterns.behavioral.Iterator;

public class Product {
    private String name;
    private double price;

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

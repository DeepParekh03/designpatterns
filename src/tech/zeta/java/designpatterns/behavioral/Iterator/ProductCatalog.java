package tech.zeta.java.designpatterns.behavioral.Iterator;

public class ProductCatalog implements Aggregate<Product> {
    private Product[] products;
    public ProductCatalog(Product[] products) {this.products=products;}

    public Product[] getProducts() {
        return products;
    }

    @Override
    public Iterator<Product> createIterator() {
        return new ProductIterator(this);
    }
}

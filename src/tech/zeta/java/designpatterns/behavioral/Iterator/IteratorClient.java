package tech.zeta.java.designpatterns.behavioral.Iterator;

public class IteratorClient {
    public static void main(String[] args) {
        Product[] products= {
                new Product(35000, "Laptop"),
                new Product(5454, "Mobile"),
                new Product(342, "Mouse")
        };
        ProductCatalog catalog=new ProductCatalog(products);
        Iterator<Product> iterator=catalog.createIterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}

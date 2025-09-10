package tech.zeta.java.designpatterns.behavioral.Iterator;

public class ProductIterator implements Iterator<Product> {
    private ProductCatalog productCatalog;

    private int position=0;

    public ProductIterator(ProductCatalog productCatalog){
        this.productCatalog=productCatalog;
    }

    @Override
    public boolean hasNext() {
        return position<productCatalog.getProducts().length;
    }

    @Override
    public Product next() {
        if(hasNext()) return productCatalog.getProducts()[position++];
        throw  new ArrayIndexOutOfBoundsException("no more products found");
    }

    @Override
    public void remove() {
        //implemenatation for removign the product
    }
}

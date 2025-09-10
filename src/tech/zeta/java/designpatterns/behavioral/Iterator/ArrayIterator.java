package tech.zeta.java.designpatterns.behavioral.Iterator;

public class ArrayIterator<T> implements Iterator {
    private T[] array;
    private int position=0;

    public ArrayIterator(T[] array){
        this.array=array;
    }
    @Override
    public boolean hasNext() {
        return position<array.length;
    }

    @Override
    public Object next() {
        if(hasNext()) return array[position++];
        throw new ArrayIndexOutOfBoundsException("No more Elements");
    }

    @Override
    public void remove() {
            // implementation to remove the current element
    }
}

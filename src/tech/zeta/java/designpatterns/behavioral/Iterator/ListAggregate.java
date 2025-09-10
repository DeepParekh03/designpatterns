package tech.zeta.java.designpatterns.behavioral.Iterator;

public class ListAggregate<T> implements Aggregate<T>{
    private T[] data;


    public ListAggregate(T[] data){this.data=data;}
    @Override
    public Iterator<T> createIterator() {
        return new ArrayIterator<>(data);
    }
}

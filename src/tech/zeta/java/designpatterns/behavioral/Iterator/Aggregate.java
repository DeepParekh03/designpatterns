package tech.zeta.java.designpatterns.behavioral.Iterator;

public interface Aggregate<T>{
    Iterator<T> createIterator();
}

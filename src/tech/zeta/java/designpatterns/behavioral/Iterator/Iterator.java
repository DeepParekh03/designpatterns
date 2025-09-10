package tech.zeta.java.designpatterns.behavioral.Iterator;

public interface Iterator<T>{
    boolean hasNext();
    T next();
    void remove();
}

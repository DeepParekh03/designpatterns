package tech.zeta.java.designpatterns.creational;

import tech.zeta.java.designpatterns.creational.singleton.ThreadSafeSingleton;

public class ThreadSafeSingletonTest {
    public static void main(String[] args) {
        ThreadSafeSingleton instance1=ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instance2=ThreadSafeSingleton.getInstance();

        System.out.println(instance1==instance2);
    }
}

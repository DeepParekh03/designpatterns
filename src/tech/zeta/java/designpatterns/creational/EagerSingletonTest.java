package tech.zeta.java.designpatterns.creational;

import tech.zeta.java.designpatterns.creational.singleton.EagerSingleton;

public class EagerSingletonTest {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton1= EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2=EagerSingleton.getInstance();
        System.out.println(eagerSingleton1==eagerSingleton2);
    }
}

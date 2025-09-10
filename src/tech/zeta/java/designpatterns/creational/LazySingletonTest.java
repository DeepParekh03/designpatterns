package tech.zeta.java.designpatterns.creational;

import tech.zeta.java.designpatterns.creational.singleton.LazySingleton;

public class LazySingletonTest {
    public static void main(String[] args) {
        LazySingleton lazySingleton1= LazySingleton.getInstance();
        LazySingleton lazySingleton2= LazySingleton.getInstance();

        System.out.println(lazySingleton1==lazySingleton2);
    }
}

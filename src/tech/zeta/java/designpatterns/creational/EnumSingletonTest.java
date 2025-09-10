package tech.zeta.java.designpatterns.creational;

import tech.zeta.java.designpatterns.creational.singleton.EnumSingleton;

public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton enumSingleton=EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton1=EnumSingleton.INSTANCE;

        System.out.println(enumSingleton1==enumSingleton);
    }
}

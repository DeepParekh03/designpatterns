package tech.zeta.java.designpatterns.creational.singleton;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("Eager Singleton instance created");
    }

    public void businessLogic(){
        System.out.println("Eager Singleton business logic area");
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}

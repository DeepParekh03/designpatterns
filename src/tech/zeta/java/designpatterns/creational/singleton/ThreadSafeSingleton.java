package tech.zeta.java.designpatterns.creational.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){
        System.out.println("ThreadSafeSingleton instance created");
    }

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance==null) instance=new ThreadSafeSingleton();
        return instance;
    }

    public void businessLogic(){
        System.out.println("ThreadSafeSingleton Business Logic goes here ");
    }

}

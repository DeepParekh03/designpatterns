package tech.zeta.java.designpatterns.creational.singleton;

public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton(){
        System.out.println("DoubleCheckedSingletonInstanceCreatec");
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if(instance==null){
            synchronized (DoubleCheckedLockingSingleton.class){
                if(instance==null) instance=new DoubleCheckedLockingSingleton();
            }
        }
        return instance;
    }

    public void businessLogic(){
        System.out.println("Business Logic goes here");
    }
}

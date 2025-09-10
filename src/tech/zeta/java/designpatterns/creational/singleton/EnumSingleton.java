package tech.zeta.java.designpatterns.creational.singleton;


//Eager Initialization, enums are always singleton
public enum EnumSingleton {
    INSTANCE;

    EnumSingleton(){
        System.out.println("EnumSingleton instance create");
    }

    public void businessLogic(){
        System.out.println("EnumSingleton doing something");
    }


}

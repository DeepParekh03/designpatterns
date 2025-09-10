package tech.zeta.java.designpatterns.creational;

import tech.zeta.java.designpatterns.creational.factory.ConcreteBikeFactory;
import tech.zeta.java.designpatterns.creational.factory.ConcreteCarFactory;
import tech.zeta.java.designpatterns.creational.factory.FactoryVehicle;
import tech.zeta.java.designpatterns.creational.factory.ProductVehicle;

public class FactoryClient {
    public static void main(String[] args) {
        FactoryVehicle carFactory=new ConcreteCarFactory();
        carFactory.manufactureVehicle(); //Assembles the car

        FactoryVehicle bikeFactory=new ConcreteBikeFactory();
        bikeFactory.manufactureVehicle(); // Assembles the motorcyle
    }
}

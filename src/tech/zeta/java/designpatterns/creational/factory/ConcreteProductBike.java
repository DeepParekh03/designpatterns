package tech.zeta.java.designpatterns.creational.factory;

public class ConcreteProductBike implements ProductVehicle{ //Concrete Product 2
    @Override
    public void assemble() {
        System.out.println("Asembling a bike.");
    }
}

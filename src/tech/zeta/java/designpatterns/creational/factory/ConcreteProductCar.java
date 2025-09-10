package tech.zeta.java.designpatterns.creational.factory;

public class ConcreteProductCar implements ProductVehicle { //ConcreteProduct 1
    @Override
    public void assemble() {
        System.out.println("Assembling a car");
    }
}

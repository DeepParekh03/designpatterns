package tech.zeta.java.designpatterns.creational.factory;

public class ConcreteCarFactory extends FactoryVehicle{
    @Override
    public ProductVehicle createVehicle() {
        return new ConcreteProductCar();
    }
}

package tech.zeta.java.designpatterns.creational.factory;

public class ConcreteBikeFactory extends FactoryVehicle{
    @Override
    public ProductVehicle createVehicle() { //keep it product vehicle not my concrute product
        return new ConcreteProductBike();
    }
}

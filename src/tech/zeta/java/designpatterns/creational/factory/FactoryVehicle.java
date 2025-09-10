package tech.zeta.java.designpatterns.creational.factory;


public abstract class FactoryVehicle { //Creator (Factory)
    public abstract ProductVehicle createVehicle();

    public ProductVehicle manufactureVehicle(){
        ProductVehicle vehicle= createVehicle();
        vehicle.assemble();
        return vehicle;
    }
}

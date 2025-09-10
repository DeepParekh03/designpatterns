package tech.zeta.java.designpatterns.structural.decorator;

public class Milk extends CoffeeDecorator{
    public Milk(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", with Milk";
    }

    @Override
    public double getCost() {
        return super.getCost()+12.0;
    }
}

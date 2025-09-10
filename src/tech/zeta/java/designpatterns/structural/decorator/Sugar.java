package tech.zeta.java.designpatterns.structural.decorator;

public class Sugar extends CoffeeDecorator{
    public Sugar(Coffee coffee){
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", with Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost()-20.0;
    }
}

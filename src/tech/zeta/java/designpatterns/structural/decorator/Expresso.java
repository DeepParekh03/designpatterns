package tech.zeta.java.designpatterns.structural.decorator;

public class Expresso implements Coffee{

    @Override
    public String getDescription() {
        return "Expresso";
    }

    @Override
    public double getCost() {
        return 140;
    }
}

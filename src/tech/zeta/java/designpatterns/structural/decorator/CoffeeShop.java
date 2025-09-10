package tech.zeta.java.designpatterns.structural.decorator;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee=new Expresso();
        System.out.println("Cost: "+coffee.getCost()+", Description: "+ coffee.getDescription());

        Coffee coffeeWithMilk=new Milk(coffee);
        System.out.println("Cost: "+coffeeWithMilk.getCost()+", Description: "+ coffeeWithMilk.getDescription());

        Coffee coffeeWithMilkWithSugar=new Sugar(coffeeWithMilk);
        System.out.println("Cost: "+coffeeWithMilkWithSugar.getCost()+", Description: "+ coffeeWithMilkWithSugar.getDescription());

        Coffee coffeeWithoutMilkWithSugar=new Sugar(coffee);
        System.out.println("Cost: "+coffeeWithoutMilkWithSugar.getCost()+", Description: "+ coffeeWithoutMilkWithSugar.getDescription());

    }
}

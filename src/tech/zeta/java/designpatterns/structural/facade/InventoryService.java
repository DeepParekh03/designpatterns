package tech.zeta.java.designpatterns.structural.facade;

public class InventoryService {
    public boolean checkInventory(String productId,int quantity){
        System.out.printf("Checking inventroy for product with ID: %s with quantity %d %n",productId,quantity);
        return true;
    }


}

package tech.zeta.java.designpatterns.structural.facade;

public class ShippingService {
    public String shipOrder(String orderId,String shippingAddress){
        System.out.printf("Order shipped of order id: %s ,to the address : %s %n",orderId,shippingAddress);
        return "Ship-"+orderId;
    }
}

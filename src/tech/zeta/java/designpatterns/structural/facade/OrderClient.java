package tech.zeta.java.designpatterns.structural.facade;

public class OrderClient {
    public static void main(String[] args) {
        OrderFacade orderFacade=new OrderFacade();
        String trackingId=orderFacade.placeOrder("Product123",2,"Credit Card","Zeta, Brookfield, Bangalore");
        if(trackingId!=null && trackingId.startsWith("Ship-")){
            System.out.println("Order Placed Successfully, Tracking ID: "+trackingId);
        }else{
            System.out.println("Order placement failed");
        }
    }
}

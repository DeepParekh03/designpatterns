package tech.zeta.java.designpatterns.structural.facade;


public class OrderFacade {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;

    public OrderFacade(){
        this.inventoryService=new InventoryService();
        this.paymentService=new PaymentService();
        this.shippingService=new ShippingService();
    }

    public String placeOrder(String productId, int quantity, String paymentInfo,String shippingAddress){
        if(!inventoryService.checkInventory(productId,quantity)){
            return "Order failed insufficient stock";
        }
        double amount =quantity*100;
        if(!paymentService.processPayment(paymentInfo,amount))
            return "Order failed: Payment Processing Failed";
        String orderId= "ORD-1";
        return shippingService.shipOrder(orderId,shippingAddress);
    }
}

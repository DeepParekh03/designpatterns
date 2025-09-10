package tech.zeta.java.designpatterns.creational.factorypayment;

public abstract class PaymentGatewayFactory {
    public abstract PaymentGateway createPaymentGateway();

    public void charge(double amount){
        PaymentGateway gateway=createPaymentGateway();
        gateway.processPayment(amount);
    }
}

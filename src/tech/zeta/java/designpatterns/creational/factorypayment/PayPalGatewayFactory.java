package tech.zeta.java.designpatterns.creational.factorypayment;

public class PayPalGatewayFactory extends PaymentGatewayFactory{
    @Override
    public PaymentGateway createPaymentGateway() {
        return new PayPalGateway();
    }
}

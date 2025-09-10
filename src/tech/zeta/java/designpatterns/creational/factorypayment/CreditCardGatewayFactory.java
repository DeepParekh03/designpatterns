package tech.zeta.java.designpatterns.creational.factorypayment;

public class CreditCardGatewayFactory extends PaymentGatewayFactory{
    @Override
    public PaymentGateway createPaymentGateway() {
        return new CreditCardGateway();
    }
}

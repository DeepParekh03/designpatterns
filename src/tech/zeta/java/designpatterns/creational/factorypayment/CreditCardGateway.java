package tech.zeta.java.designpatterns.creational.factorypayment;

public class CreditCardGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processng %.2f payment via credit card %n",amount);
    }
}

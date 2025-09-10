package tech.zeta.java.designpatterns.creational.factorypayment;

public class PayPalGateway implements PaymentGateway{
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing %.2f payment via Pay Pal %n",amount);
    }
}

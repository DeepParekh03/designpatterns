package tech.zeta.java.designpatterns.creational;

import tech.zeta.java.designpatterns.creational.factorypayment.CreditCardGatewayFactory;
import tech.zeta.java.designpatterns.creational.factorypayment.PayPalGatewayFactory;
import tech.zeta.java.designpatterns.creational.factorypayment.PaymentGatewayFactory;

public class PaymentFactoryTest {

    public static void main(String[] args) {
        PaymentGatewayFactory creditCardFactory= new CreditCardGatewayFactory();
        creditCardFactory.charge(1000);
        PaymentGatewayFactory paypalFactory=new PayPalGatewayFactory();
        paypalFactory.charge(2000);
    }
}

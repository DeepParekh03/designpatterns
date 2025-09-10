package tech.zeta.java.designpatterns.structural.facade;

public class PaymentService {
    public boolean processPayment(String paymentInfo, double amount){
        System.out.printf("Processing payment of %.2f inr with payment info %s %n",amount,paymentInfo);
        return true;
    }
}

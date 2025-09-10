package tech.zeta.java.designpatterns.behavioral.observer;

public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObeserver();
}

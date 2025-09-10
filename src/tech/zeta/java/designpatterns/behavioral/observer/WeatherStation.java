package tech.zeta.java.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private List<Observer> observerList=new ArrayList<>();

    private int temperature;

    public int getTemperature(){return temperature;}
    public void setTemperature(int temperature){
        this.temperature=temperature;
        notifyObeserver();
    }

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }


    @Override
    public void notifyObeserver() {
        for(Observer observer: observerList) observer.update(temperature);
    }
}

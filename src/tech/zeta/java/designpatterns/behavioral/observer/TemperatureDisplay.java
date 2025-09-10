package tech.zeta.java.designpatterns.behavioral.observer;

public class TemperatureDisplay implements Observer{
    private Subject weatherStation;
    private int currentTemperature;
    private String displayName;

    public TemperatureDisplay(Subject weatherStation, String displayName){
        this.weatherStation=weatherStation;
        this.displayName=displayName;
        weatherStation.attach(this);
    }
    @Override
    public void update(int temperature) {
    this.currentTemperature=temperature;
    displayTemperature();
    }

    public void displayTemperature(){
        System.out.printf(displayName+ " Current Temperature is %d %cC %n",currentTemperature,176);
    }
}

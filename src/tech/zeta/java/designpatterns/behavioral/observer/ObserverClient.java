package tech.zeta.java.designpatterns.behavioral.observer;

public class ObserverClient {
    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation();

        TemperatureDisplay display=new TemperatureDisplay(weatherStation,"TV");
        TemperatureDisplay display1=new TemperatureDisplay(weatherStation,"Mobile");
        TemperatureDisplay display2=new TemperatureDisplay(weatherStation,"Website");

        weatherStation.setTemperature(25);
        weatherStation.setTemperature(30);
        weatherStation.detach(display1);
        weatherStation.setTemperature(45);
    }
}

package tech.zeta.java.designpatterns.structural.bridge;

public interface Device {
    void power();
    void setVolume(int percent);
    int getVolume();
    String getName();
}

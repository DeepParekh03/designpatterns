package tech.zeta.java.designpatterns.structural.bridge;

public abstract class RemoteControl {
    protected Device device;
    public RemoteControl(Device device){
        this.device=device;
    }
    public void power(){
       device.power();
    }
    public void volumeUp(){
        int currentVolume=device.getVolume();
        device.setVolume(currentVolume+10);
    }

    public void volumeDown(){
        int currentVolume=device.getVolume();
        device.setVolume(currentVolume-10);
    }
}

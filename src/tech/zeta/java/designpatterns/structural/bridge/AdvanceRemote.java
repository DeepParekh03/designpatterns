package tech.zeta.java.designpatterns.structural.bridge;

public class AdvanceRemote extends RemoteControl{
    public AdvanceRemote(Device device){
        super(device);
    }

    public void mute(){
        System.out.printf("The device %s will be muted. %n",device.getName());
        device.setVolume(0);
    }
}

package tech.zeta.java.designpatterns.structural.bridge;

public class TV implements Device{
    private boolean enabled=false;
    private int volume=30;


    @Override
    public void power() {
        if(!enabled){
            System.out.println("TV Power on");
            enabled=true;
        }
        else{
            System.out.println("TV Power off");
            enabled=false;
        }
    }

    @Override
    public void setVolume(int percent) {
        volume=Math.min(100,Math.max(0,percent));
        System.out.println("TV: volume set to "+volume+"%");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public String getName() {
        return "TV";
    }
}

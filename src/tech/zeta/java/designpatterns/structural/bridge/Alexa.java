package tech.zeta.java.designpatterns.structural.bridge;

public class Alexa implements Device{

    private boolean enabled=false;
    private int volume=12;


    @Override
    public void power() {
        if(!enabled){
            System.out.println("Alexa Power on");
            enabled=true;
        }
        else{
            System.out.println("Alexa Power off");
            enabled=false;
        }
    }



    @Override
    public void setVolume(int percent) {
        volume=Math.min(100,Math.max(0,percent));
        System.out.println("Alexa: volume set to "+volume+"%");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public String getName() {
        return "Alexa";
    }
}

package tech.zeta.java.designpatterns.structural.bridge;

public class RemoteClient {
    public static void main(String[] args) {
        TV tv=new TV();
        Alexa alexa=new Alexa();
        BasicRemote basicRemoteTV=new BasicRemote(tv);
        AdvanceRemote advanceRemoteAlexa=new AdvanceRemote(alexa);

        basicRemoteTV.power();
        basicRemoteTV.volumeUp();
        basicRemoteTV.volumeUp();
        basicRemoteTV.volumeDown();
        basicRemoteTV.power();

        advanceRemoteAlexa.power();
        advanceRemoteAlexa.volumeUp();
        advanceRemoteAlexa.volumeDown();
        advanceRemoteAlexa.volumeUp();
        advanceRemoteAlexa.mute();
        advanceRemoteAlexa.power();



    }
}

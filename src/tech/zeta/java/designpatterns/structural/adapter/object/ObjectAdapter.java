package tech.zeta.java.designpatterns.structural.adapter.object;

public class ObjectAdapter implements Target{
    private ObjectAdaptee adaptee;

    public ObjectAdapter(ObjectAdaptee adaptee){
        this.adaptee=adaptee;
    }

    @Override
    public String request() {
        return "Adapter: "+adaptee.specificRequest();
    }
}

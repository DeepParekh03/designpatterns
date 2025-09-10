package tech.zeta.java.designpatterns.structural.adapter.classAdapter;

import tech.zeta.java.designpatterns.structural.adapter.classAdapter.Target;

public class Adapter extends Adaptee implements Target {



    @Override
    public String request() {
        return "Adapter: "+specificRequest();
    }
}

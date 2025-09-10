package tech.zeta.java.designpatterns.structural.adapter;

import tech.zeta.java.designpatterns.structural.adapter.object.ObjectAdaptee;
import tech.zeta.java.designpatterns.structural.adapter.object.ObjectAdapter;
import tech.zeta.java.designpatterns.structural.adapter.object.Target;


//does not adaptee's specific request just contacts with target
public class ObjectAdapterClient {
    public static void main(String[] args) {
        ObjectAdaptee adaptee=new ObjectAdaptee();
        Target target=new ObjectAdapter(adaptee);
        System.out.println(target.request());
    }
}

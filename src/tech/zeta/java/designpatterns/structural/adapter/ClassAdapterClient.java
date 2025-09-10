package tech.zeta.java.designpatterns.structural.adapter;

import tech.zeta.java.designpatterns.structural.adapter.classAdapter.Adapter;
import tech.zeta.java.designpatterns.structural.adapter.classAdapter.Target;

public class ClassAdapterClient {
    public static void main(String[] args) {
        Target target=new Adapter();
        System.out.println(target.request());
    }
}

package tech.zeta.java.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static Map<String,Shape> shapeMap=new HashMap<>();

    public static Shape getShape(String shapeId){
        Shape cachedShape=shapeMap.get(shapeId);
        return cachedShape.clone();
    }

    public static void loadCache(){
        Shape circle=new Circle(10,10,3);
        shapeMap.put("1",circle);
        Shape rectange=new Rectangle(20,21);
        shapeMap.put("2", rectange);
    }
}

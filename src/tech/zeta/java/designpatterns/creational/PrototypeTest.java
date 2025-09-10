package tech.zeta.java.designpatterns.creational;

import tech.zeta.java.designpatterns.creational.prototype.Shape;
import tech.zeta.java.designpatterns.creational.prototype.ShapeCache;

public class PrototypeTest {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape cloneCircle=ShapeCache.getShape("1");
        cloneCircle.draw();
        /* from shapeCache clone object will be called the original
        copy will not be tampered for circle, circle clone will be called
         */

        Shape cloneRectange=ShapeCache.getShape("2");
        cloneRectange.draw();

    }
}

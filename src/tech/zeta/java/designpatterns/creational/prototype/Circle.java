package tech.zeta.java.designpatterns.creational.prototype;

public class Circle implements Shape{
    private int xAxis;
    private int yAxis;
    private int radius;

    public  Circle(int  xAxis,int yAxis,int radius){
        this.xAxis=xAxis;
        this.yAxis=yAxis;
        this.radius=radius;
    }

    public Circle(){}

    public int getxAxis() {
        return xAxis;
    }

    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public Circle clone() {
        try {
            Circle clone = (Circle) super.clone();
            return clone;
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError("Cannot clone Cirlce Shape");
        }
    }

    @Override
    public void draw() {
        System.out.printf("Drawing circle at %d and %d with radius %d %n", xAxis,yAxis,radius);
    }
}

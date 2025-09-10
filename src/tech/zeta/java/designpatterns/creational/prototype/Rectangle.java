package tech.zeta.java.designpatterns.creational.prototype;

public class Rectangle implements Shape{
    private int width;
    private int height;

    public Rectangle(){}

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing rectangle wiht %d height and %d width ",height,width);
    }

    @Override public Rectangle clone(){
        try {
            Rectangle clone = (Rectangle) super.clone();
            return clone;
        }catch (CloneNotSupportedException cloneNotSupportedException){
            throw new AssertionError("Cannot clone Rectangle Shape");
        }
    }
}

package Abstract_Odev._04_Soru;

public abstract class Data {

    private int radius=5;
    private int length=6;
    private int width=5;


    public final double pi=3.14;

    abstract double getArea();


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}

package Abstract_Odev._04_Soru;

public class Circle extends Data {


    @Override
    public double getArea() {
        return pi*getRadius()*getRadius();
    }
}

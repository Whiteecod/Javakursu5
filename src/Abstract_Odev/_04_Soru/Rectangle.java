package Abstract_Odev._04_Soru;

public class Rectangle extends Data {


    @Override
    double getArea() {
        return getLength()*getWidth();
    }

}

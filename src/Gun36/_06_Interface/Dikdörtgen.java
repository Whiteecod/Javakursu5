package Gun36._06_Interface;

public class Dikdörtgen implements ISekil{

    @Override
    public double alan(double kisaKenar, double uzunKenar) {
        return kisaKenar*uzunKenar;
    }

    @Override
    public double cevre(double kisaKenar, double uzunKenar) {
        return (kisaKenar+uzunKenar)*2;
    }
}

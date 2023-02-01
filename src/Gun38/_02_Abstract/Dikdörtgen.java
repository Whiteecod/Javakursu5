package Gun38._02_Abstract;

public class Dikdörtgen extends Sekil{
    private double kisaKenar;
    private double uzunKenar;

    public Dikdörtgen(double kisaKenar, double uzunKenar) {
       setKisaKenar(kisaKenar);
       setUzunKenar(uzunKenar);
    }

    @Override
    double alan() {
        return this.kisaKenar*this.uzunKenar;
    }

    @Override
    double cevre() {
        return (this.kisaKenar+this.uzunKenar)*2;
    }

    @Override
    public String toString() {
        return "Dikdörtgen{} " + super.toString();
    }

    public double getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
}

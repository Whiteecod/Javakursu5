package Gun30._02_FinalVariables.Ornek1;

public class Vatandas {
    String isim;
    final int tcNo; // Değiştirilemeez
    // yani sadece 1 kez veri atama şansı vardır.

    static int tcNosayac=1;

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = tcNosayac++;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}

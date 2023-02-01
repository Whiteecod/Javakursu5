package Gun32._03_Encapsulation;

import java.util.ArrayList;
import java.util.Objects;

public class Okul {
    private String okulAd;
    private int kontenjan;
    private ArrayList<Ogrenci> ogrenciler=new ArrayList<>();


    public Okul(String okulAd, int kontenjan) {
        setOkulAd(okulAd);
        setKontenjan(kontenjan);
    }

    public String getOkulAd() {
        return okulAd;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", kontenjan='" + kontenjan + '\'' +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}


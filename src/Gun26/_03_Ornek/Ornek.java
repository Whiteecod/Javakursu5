package Gun26._03_Ornek;

public class Ornek {
    public static void main(String[] args) {
        Musteri mus1 = new Musteri();
        mus1.name = "İsmet Temur";
        mus1.elektrikHesabi = new ElektrikHesabi();
        mus1.elektrikHesabi.tuketimEkle(50);
        mus1.elektrikHesabi.tuketimEkle(60);
        mus1.elektrikHesabi.tuketimEkle(70);
        mus1.elektrikHesabi.toplamTuketimYaz();

        mus1.elektrikHesabi.faturaYaz(mus1.name);


    }
}

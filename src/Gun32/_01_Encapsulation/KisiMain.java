package Gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {

        Kisi k1 = new Kisi();
//        k1.ad="İsmet";
//        k1.soyad="Temur";
        // k1.yas=-25;
        k1.setAd("İsmet");
        k1.setSoyad("Temur");
        k1.yasAta(-25);

        System.out.println("k1.yasVer() = " + k1.yasVer());

        System.out.println("k1 = " + k1);

        // değişkene direk erişimi kapatıp
        // bir metod ile korumalı veri gönderme ve alma
        // işlemine Encapsulation denir.
    }
}
